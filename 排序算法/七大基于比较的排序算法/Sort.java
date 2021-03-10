package sort.七大基于比较的排序算法;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-08
 * Time 15:13
 */
public class Sort {
    //插入排序
    public static  void insertSort(int[] array){
        //认为第一个是有序的
        for (int i=1;i<array.length;i++){
            //有序区间[0,i)
            //无序区间[i,arr.length]
            int key = array[i];// 无序区间的第一个数
            int j =0;
            //无序区间的第一个数是下标为i的元素,要在有序区间从后往前依次进行比较
            for (j=i-1;j>=0;j--){
                if (key < array[j]){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = key;
        }
    }
    //希尔排序
    public static  void shellSort(int[] array){
        //分组进行插排
        int gap = array.length/2;
        while (true){
            insertSortGap(array,gap);
            if (gap == 1){
                break;
            }
            gap = gap/2;
        }
    }
    //插排
    private static void insertSortGap(int[] array, int gap) {
        //从gap位置开始
        for (int i = gap;i<array.length;i++){
            int key = array[i];
            int j ;
            for (j = i-gap;j>=0;j = j-gap){//每gap跳一个
                if (key < array[j]){
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = key;
        }
    }

    //选择排序
    public  static  void selectSort(int[] array){
        for (int i=0;i< array.length;i++){
            //无序区间[0,array.length-i)
            //有序区间[array.length-i,array.length)
            int maxIndex =0;//选择下标为0 的元素作为最大值
            //遍历找无序区间的最大值
            for (int j =1;j<array.length-i;j++){//无序区间
                if (array[j] > array[maxIndex]){
                    maxIndex = j;
                }
            }
            //交换最大值和无序区间的最后一个元素
            swap(array,maxIndex,array.length-i-1);
        }
    }
    //双向选择排序
    public static  void doubleSelectSort(int[] array){
       int low = 0;
       int high = array.length-1;
       while (low < high){
           int min = low;
           int max = low;
           for (int i = low+1;i<=max;i++){
               if (array[i] < array[min]){
                   min = i;
               }
               if (array[i] > array[max]){
                   max = i;
               }
           }
           swap(array,min,low);
           if (max == low){
               max = min;
           }
           swap(array,max,high);
       }
    }
    //选择排序的变形—堆排序
    public static  void heapSort(int[] array){
        //先建大堆
        createHeap(array,array.length);
        //选择的过程：一共需要选择array.length-1组
        for (int i= 0;i< array.length-1;i++){
            //交换之前：
            //无序区间[0,array.length-i)
            //有序区间[array.length-i,array.length)
            swap(array,0,array.length-i-1);
            //交换之后无序区间的最后一个元素就不需要再参与向下调整的过程
            //交换之后：
            //无序区间[0,array.length-i-1)
            //有序区间[array.length-i-1,array.length)
            //无序区间的长度：array.length-i-1
            shiftDown(array,array.length-i-1,0);
        }
    }
    private static void createHeap(int[] array, int length) {
        for (int i = (length-1)/2; i >=0; i--) {
            //从最后一个非叶子结点（最后一个结点的父结点）开始进行向下调整
            shiftDown(array,array.length,i);
        }
    }
    public static void shiftDown(int[] array,int size,int index) {
        int left = 2*index+1;
        while ( left< size){
            int maxIndex  = left;
            if (maxIndex+1  < size && array[maxIndex+1] > array[maxIndex]){
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

    //冒泡排序
    public  static  void  bubbleSort(int[] array){
        //外层循环——冒泡的次数
        for (int i=0;i< array.length-1;i++){
            //无序区间[0,array.length-i)
            //有序区间[array.length-i,array.length)

            boolean isSorted = true;//优化
            //内层循环：每一次冒泡交换的操作
            for (int j =0;j< array.length-i-1;j++){//在无序区间进行
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }
            //经过一次循环，如果isSorted依然是true说明已经是有序的
            if (isSorted){
                break;//已经是有序的了，没有再进行交换操作
            }
        }
    }
    //快速排序
    public static  void quickSort(int[] array){
        quickInternal(array,0,array.length-1);
    }

    private static void quickInternal(int[] array, int left, int right) {
        if (left == right){
            return;
        }
        if (left > right){
            return;
        }
        int keyIndex = partition2(array,left,right);
        quickInternal(array,left,keyIndex-1);
        quickInternal(array,keyIndex+1,right);

    }
    //三种方法
    //Hoare法
    private static int partition(int[] array, int left, int right) {
        int i =left;
        int j = right;
        int key = array[left];
        while (i < j){
            //先从后往前
            while (i < j && array[j] >=key){
                j--;
            }
            while (i < j && array[i] <= key){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return i;
    }
    //挖坑法
    private static int partition1(int[] array, int left, int right) {
        int i =left;
        int j = right;
        int key = array[left];
        while (i < j){
            //先从后往前
            while (i < j && array[j] >=key){
                j--;
            }
            array[i] = array[j];
            while (i< j && array[i] <= key){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = key;
        return i;
    }
    //前后遍历法
    private static int partition2(int[] array,int lowIndex,int highIndex){
        int separateIndex = lowIndex +1; //用来分隔，当出现小于lowIndex位置的数时，交换，separateIndex往后走
        for(int i = lowIndex+1;i<=highIndex;i++) {//用来遍历数组
            if(array[i] < array[lowIndex]) {
                swap(array,i,separateIndex);
                separateIndex++;
            }
         }
         swap(array,lowIndex,separateIndex-1);
        return separateIndex-1;
    }

    //归并排序
    public static  void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length);
    }
    //区间范围是左闭右开的array[low,high)
    private static void mergeSortInternal(int[] array, int low, int high) {
        int size = high-low;
        if (size <=1){
            return;
        }
        int mid = (low+high)/2;
        //区间被分为左右两个部分
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid,high);
        //合并两个有序区间
        merge(array,low,mid,high);
    }
    //合并两个有序数组
    private static void merge(int[] array, int low, int mid, int high) {
        //需要一个额外的数组
        int length = high-low;
        int[] extraArray = new int[length];

        int leftIndex = low;
        int rightIndex = mid;
        int extraIndex = 0;
        //左右两个区间中都有数据
        while (leftIndex < mid && rightIndex < high ){
            if (array[leftIndex] <= array[rightIndex]){
                extraArray[extraIndex++] = array[leftIndex++];
            }else {
                extraArray[extraIndex++] = array[rightIndex++];
            }
        }
        while (leftIndex  < mid){//左边有数据
            extraArray[extraIndex++] = array[leftIndex++];
        }
        while (rightIndex < high){
            extraArray[extraIndex++] = array[rightIndex++];
        }
        //最后把数据从新数组统一搬回去
        //新数组[0,length),要搬回去的下标[low,high)
        //从extraArray搬回array
        for (int i=0;i < length;i++){
            array[i+low] = extraArray[i];
        }
    }

    public static void main(String[] args) {
        //测试
        //随机生成的乱序数组
        int[] array1 = 构建随机数组();
        mergeSort(array1);
        System.out.println(Arrays.toString(array1));

        //数组已经有序
        int[] array2 = 构建有序数组();
        mergeSort(array2);
        System.out.println(Arrays.toString(array2));
        //数组完全逆序
        int[] array3 = 构建逆序数组();
        mergeSort(array3);
        System.out.println(Arrays.toString(array3));
        //数组中的元素都相等
        int[] array4 = 构建完全相等的数组();
        mergeSort(array4);
        System.out.println(Arrays.toString(array4));
    }
    public static  int[] 构建随机数组(){
        Random random = new Random(123456789);
        int[] array = new int[10];
        for (int i=0;i<10;i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static int[] 构建有序数组(){
        int[] array = 构建随机数组();
        Arrays.sort(array);
        return array;
    }
    public static  int[] 构建逆序数组(){
        int[] array = 构建有序数组();
        swap(array,0,9);
        swap(array,1,8);
        swap(array,2,7);
        swap(array,3,6);
        swap(array,4,5);
        return array;
    }
    public static  void  swap(int[] array,int i ,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int[] 构建完全相等的数组(){
        int[] array = 构建随机数组();
        for (int i=0;i< array.length;i++){
            array[i] = 1;
        }
        return array;
    }
}
