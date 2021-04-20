package 排序;

/**
 * ClassName 排序
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 19:49
 */
public class HeapSort {
    public void heapSort(int[] array){
        //建大堆
        createHeap(array,array.length);
        for (int i =0;i<array.length-1;i++){
            //选择无序区间最大的与最后一个交换
            swap(array,0,array.length-i-1);
            shiftDown(array,array.length-i-1,0);
        }
    }

    private void swap(int[] array, int i , int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void shiftDown(int[] array, int size, int index) {
        int left = 2*index+1;
        while (left < size){
            int maxIndex = left;
            if(maxIndex+1 < size && array[maxIndex+1] > array[maxIndex]){
                maxIndex = maxIndex+1;
            }
            if (array[index] >= array[maxIndex]){
                break;
            }
            swap(array,index,maxIndex);
            index = maxIndex;
            left = 2*index+1;
        }
    }

    private void createHeap(int[] array, int length) {
        for (int i = (length-1)/2;i>= 0;i--){
            //从最后一个非叶子节点开始进行向下调整
            shiftDown(array,array.length,i);
        }
    }
}
