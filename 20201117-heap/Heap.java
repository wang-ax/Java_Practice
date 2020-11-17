/**
 * ClassName Heap
 * Description TODO
 * Author 30712
 * Date 2020-11-17
 * Time 10:45
 */
public class Heap {
    /**
     *
     * @param array 储存堆的数组
     * @param size  数组中被视为堆数据的个数
     * @param index 要调整位置的下标
     */
    //向下调整
    public  static  void ShiftDown(int[] array,int size,int index) {
        //1.判断index位置是不是叶子节点
        int leftIndex = 2 *index +1;
        if(leftIndex >= size) {
            return;
        }
        //找出两个孩子中最小的
        int minIndex = leftIndex;
        int rightIndex  = leftIndex +1;
        if(rightIndex <size && array[rightIndex] < array[leftIndex]) {
            minIndex = rightIndex;
        }
        //两个孩子中最小的和index位置的值进行比较
        if(array[index] <= array[minIndex]) {
            return;
        }
        //交换小孩子的值与index位置的值
        int t = array[index];
        array[index] = array[minIndex];
        array[minIndex] = t;
        //小孩子位置作为index，继续循环
        index = minIndex;

    }
    //建堆
    //从最后一个非叶子节点（最后一个节点的父节点）开始进行到根节点进行向下调整
    public static  void createHeap(int[] array,int size) {
        int lastIndex = size -1;
        int lastparentIndex = (lastIndex-1)/2;//最后一个非叶子节点
        for(int i = lastparentIndex;i>= 0;i--) {
            ShiftDown(array,size,i);
        }
    }
}
