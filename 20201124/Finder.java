package 每日一题1;

/**
 * ClassName 每日一题1
 * Description TODO 寻找第k大
 * 一个整数数组，根据快速排序的思路，找出数组中第K大的数
 * Author 30712
 * Date 2020-11-24
 * Time 15:38
 */
public class Finder {
    public static int findKth(int[] a, int n, int K) {
        // write code here
        //对数组进行排序
        quicksort(a);//使用快速排序先对数组进行排序
        //返回n-k位置的元素，就是第K大的元素
        return a[n-K];
    }

    public static  void quicksort(int[] array) {
        quicksortInternal(array,0,array.length-1);
    }
    public static void quicksortInternal(int[] array,int lowIndex,int highIndex) {
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
    private static int partition(int[] array,int lowIndex,int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;

        int key = array[lowIndex];
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= key) {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];
            while (leftIndex < rightIndex && array[leftIndex] <= key) {
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
        }
        array[leftIndex] = key;
        return leftIndex;
    }
/*
    //测试用例
    public static void main(String[] args) {
        int[] array = {1,3,5,2,2,8};
        System.out.println(findKth(array, 6, 3));
    }*/
}
