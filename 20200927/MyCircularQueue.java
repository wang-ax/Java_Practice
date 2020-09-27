/**
 * ClassName MyCircularQueue
 * Description TODO
 * Author 30712
 * Date 2020-09-27
 * Time 13:43
 */
public class MyCircularQueue {
    private final int[] array;
    private int size;
    private  int frontIndex;
    private int rearIndex;
    public  MyCircularQueue (int k) {
        array = new int[k];
        size = 0;
        frontIndex = 0;
        rearIndex = 0;
    }
    public boolean enQueue (int value) {
        if(size == array.length) {
            return  false;
        }
        array[rearIndex] = value;
        size++;
        rearIndex++;
        if(rearIndex == array.length) {
            rearIndex = 0;
        }
        return true;
    }
    public boolean deQueue() {
        if(size == 0) {
            return false;
        }
        size--;
        frontIndex++;
        if(frontIndex == array.length) {
            frontIndex = 0;
        }
        return true;
    }
    public int Front() {
        if (size == 0) {
            return  -1;
        }
        return array[frontIndex];
    }
//返回队尾元素
    /** Get the last item from the queue. */
    public int Rear() {
        if (size == 0) {
            return  -1;
        }
        int index = rearIndex-1;
        if(index == -1) {
            index = array.length-1;
        }
        return array[index];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == array.length;
    }
}
