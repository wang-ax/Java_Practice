/**
 * ClassName Heap
 * Description TODO
 * Author 30712
 * Date 2020-10-15
 * Time 16:06
 */
public class Heap {
    //向下调整
    public static void shiftDown(int[] array,int size,int index) {
        //1.判断index是不是叶子结点（有没有孩子），看左孩子的下标是否越界，如果越界则没有左孩子
        int leftIndex = 2*index +1;
        if(leftIndex >= size) {
            return;
        }
        //2.找出两个孩子中最小的
        int minIndex = leftIndex;
        int rightIndex = leftIndex +1;
        if(rightIndex < size && array[rightIndex] < array[leftIndex]) {
            minIndex = rightIndex;
        }
        //3.小孩子的值与index位置的值进行比较
        if(array[index] <= array[minIndex]) {
            return;
        }
        //4.交换小孩子的值与index位置的值
        int t = array[index];
        array[index] = array[minIndex];
        array[minIndex] = t;
        //4.把最小的孩子作为index，继续循环
        index = minIndex;
    }
    //建堆
    public static  void createHeap(int[] array,int size){
        //从最后一个非叶子结点（最后一个结点的父结点）开始进行向下调整，i--
        int lastIndex = size -1;
        int lastparentIndex = (lastIndex-1)/2;
        for(int i = lastparentIndex; i >= 0;i--){
            shiftDown(array,size,i);
        }
    }
}
