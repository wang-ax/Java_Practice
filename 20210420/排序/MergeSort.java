package 排序;

/**
 * ClassName 排序
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 19:38
 */
public class MergeSort {
    public static  void  mergeSort(int[] array){
        mergeSortInternal(array,0,array.length);
    }

    private static void mergeSortInternal(int[] array, int low, int high) {
        //将数组分为平均的两份
        int size = high-low;
        if (size <=1){
            return;
        }
        int mid  = (low+high)/2;
        //分别对每个区间进行相同方式的处理（进行归并排序）
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid,high);
        merge(array,low,mid,high);
    }
//合并两个有序的数组
    private static void merge(int[] array, int low,int mid, int high) {
        int length = high-low;
        int[] extraArray = new int[length];

        int leftIndex = low;
        int rightIndex = mid;
        int extraIndex = 0;
        //左右两个区间都有数据
        while (leftIndex  < mid && rightIndex < high ){
            if ( array[leftIndex] <= array[rightIndex]){
                extraArray[extraIndex++] = array[leftIndex++];
            }else {
                extraArray[extraIndex++] = array[rightIndex++];
            }
        }
        while (leftIndex < mid){
            extraArray[extraIndex++] = array[leftIndex++];
        }
        while (rightIndex < high){
            extraArray[extraIndex++] = array[rightIndex++];
        }
        //最后把数据从新的数组中统一搬回去
        for (int i =0;i< length;i++){
            array[i+low] = extraArray[i];
        }
    }
}
