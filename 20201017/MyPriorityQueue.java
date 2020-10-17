/**
 * ClassName MyPriorityQueue
 * Description TODO
 * Author 30712
 * Date 2020-10-17
 * Time 18:10
 */
public class MyPriorityQueue {
    Integer[] array = new Integer[100];
    int size = 0;
//检索队首元素，但不删除
    public Integer element(){
        if(size == 0) {
            throw new RuntimeException("空");
        }
        return array[0];
    }
//删除队首元素：
//不是直接将堆顶元素删除，而是用数组的最后一个元素替换堆顶元素，然后通过向下调整的方式重新调整成堆
    public Integer remove() {
        int e = array[0];
        array[0] = array[size-1];
        size--;
        adjustDown(array ,size,0);
        return  e;
    }
    public void adjustDown(Integer[] array,int size,int index) {
        int leftIndex= 2 * index +1;
        if(leftIndex >= size) {
            return;
        }
        int minIndex = leftIndex;
        int rightIndex = leftIndex+1;
        if(rightIndex < size && array[rightIndex] < array[leftIndex]) {
            minIndex = rightIndex;
        }
        if(array[index] <= array[minIndex]) {
            return;
        }
        int t = array[index];
        array[index] = array[minIndex];
        array[minIndex] = t;

        index =minIndex;
    }
//插入指定元素
    public void add(Integer e) {
        //先将e插入到二叉树的最后一个位置
        array[size] = e;
        size++;
        //将最后一个元素进行向上调整
        adjustUp(array,size,size-1);
    }
    //向上调整
    public void adjustUp(Integer[] array,int size,int index) {
        //1.先判断index位置是不是树的根
        if(index == 0) {
            return;
        }
        //2.找到父结点
        int parentIndex = (index-1)/2;
        //3.比较（index -1）/2 位置的值与index位置的值
        if(array[parentIndex] <= array[index]) {
            return;
        }
        //交换值
        int t = array[index];
        array[index] = array[parentIndex];
        array[parentIndex] = t;
        //将父结点作为index，进行循环
        index = parentIndex;
    }

}
