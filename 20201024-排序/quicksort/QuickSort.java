package quicksort;


public class QuickSort {
    /**
     * 快速排序：
     * 1.找一个基准数（一般为最左边的数）
     * 2.执行partition（小的放在左，大的放在右）
     * 3.使用相同的方法对左右两个区间进行处理，直到小区间有序（size=0/1）
     * @param array
     */
    public static void quicksort(long[] array) {
        //一个内部的快速排序
        quicksortInternal(array,0,array.length-1);
    }

    public static void quicksortInternal(long[] array,int lowIndex,int highIndex) {
        int size = highIndex - lowIndex + 1;
        if(size <= 1) {
            return;
        }
        //1.找到一个基准数（最左边的数）
        long key = array[lowIndex];
        //2.执行partition的过程，将小的放的前面大的放到后面
        int keyIndex = partition(array, lowIndex, highIndex);//返回partition之后下一次key位置的下标
        //分别对左右区间进行相同的处理
        quicksortInternal(array, lowIndex, keyIndex - 1);
        quicksortInternal(array, keyIndex + 1, highIndex);
    }
    private static void swap(long[] array, int rightIndex, int leftIndex) {
        long t = array[rightIndex];
        array[rightIndex] = array[leftIndex];
        array[leftIndex] = t;
    }

    private static int partitionHoare(long[] array, int lowIndex, int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex =highIndex;
        //选择最左边的数
        long key = array[lowIndex];
        //选择了左边的数，从右边开始走
        while (leftIndex < rightIndex){
            while (leftIndex < rightIndex && array[rightIndex]>=key){
                rightIndex--;
            }
            //说明遇到了小于key的数
            while (leftIndex < rightIndex && array[leftIndex] <= key) {
                leftIndex++;
            }
            //说明遇到了大于key的数
            swap(array,rightIndex,leftIndex);//交换两个数
        }
        swap(array,lowIndex,leftIndex);
        return leftIndex;
    }

    //挖坑法
    private static int partition(long[] array,int lowIndex,int highIndex){
        int leftIndex = lowIndex;
        int rightIndex =highIndex;
        long key = array[lowIndex];
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= key) {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];
            while (leftIndex < rightIndex && array[leftIndex] <= key){
                leftIndex++;
            }
            array[leftIndex] = array[rightIndex];
        }
        array[leftIndex] = key;
        return leftIndex;
    }
}
