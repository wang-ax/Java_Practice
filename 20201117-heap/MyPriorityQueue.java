import java.util.Queue;

/**
 * ClassName MyPriorityQueue
 * Description TODO
 * Author 30712
 * Date 2020-11-17
 * Time 11:17
 */
public class MyPriorityQueue  {
    //以数组的形式进行保存
    Integer[] array = new Integer[100];//准备一个数组并进行初始化
    int size = 0;
    //element
    public Integer element() {
        if (size == 0) {
            //抛出异常，数组为空
            throw  new  RuntimeException("为空");
        }
        return array[0];//返回第一个元素
    }
    //add
    public  void  add(Integer e) {
        array[size] = e;
        size++;
        //向上调整
        adjustUp(array,size,size-1);

    }
    //向上调整
    public void adjustUp(Integer[] array,int size,int index) {
        if(index == 0) {
            return;
        }
        int parentIndex = (index-1)/2;
        if(array[parentIndex] <= array[index]) {
            return;
        }
        int t = array[index];
        array[index] = array[parentIndex];
        array[parentIndex] = t;

        index = parentIndex;
    }
    //出队列，删除队首元素
    public Integer remove(){
        int e = array[0];
        array[0] = array[size-1];
        size--;
        adjustDown(array,size,0);
        return  e;
    }
    public void adjustDown(Integer[] array,int size,int index) {
        int leftIndex = 2*index+1;
        if(leftIndex >= size) {
            return;
        }
        int minIndex = leftIndex;
        int rightIndex = leftIndex+1;
        if(rightIndex <size && array[rightIndex] < array[leftIndex]) {
            minIndex = rightIndex;
        }
        if(array[index] <= array[minIndex]) {
            return;
        }
        int t = array[index];
        array[index] = array[minIndex];
        array[minIndex] = t;

        index = minIndex;
    } 
}
