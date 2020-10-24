package Sort;

import java.util.Arrays;
import java.util.Random;


public class Sort {
    /**
     * 插入排序：在无序区间中拿出一个插入到有序区间去
     * 时间复杂度：
     * 最好；O(n)  有序,只需要执行外面的循环
     * 最坏：O(n^2) 逆序
     * 平均：O(n^2)  随机
     * 空间复杂度：O(1)  没有用到额外的数据空间
     * 具有稳定性
     * @param array
     */
    public static void insertSort(long[] array) {
        for(int i =0;i< array.length-1;i++) {
            //有序：[0,i]
            //无序：[i+1,array.length-1]
            long key = array[i+1];//无序区间中抓取一个数
            int j=i;
            //依次在有序区间内进行比较[i,0],从后往前比较
            for( ;j>= 0;j--) {
                if(key < array[j]) {
                    //array[j]往后移
                    array[j+1] =array[j];
                }else{
                    break;
                }
            }
            //key插到array[j]的后面
            array[j+1] =key;
        }
    }

    /**
     * 冒泡排序：每一次冒泡都是将最大的元素放到最后，前一次放到最后的就不用再进行比较
     *时间复杂度：
     *   最好；O(n)  有序
     *   最坏：O(n^2) 无序
     *   平均：O(n^2)
     *空间复杂度：O(1)
     * 具有稳定性
     * @param array
     */
    public static void bubbleSort(long[] array) {
        //[无序][有序]，只需要在无序区间内冒泡
        //无序：[0,array.length-i)   i=0时，无序区间是整个数组-1
        //有序：[array,length-i,array,length)
        //外部循环：需要多少次冒泡
        for(int i =0;i< array.length-1;i++) {
            //每次冒泡前，假设数组已经有序
            boolean isSorted = true;
            //冒泡的过程：进行两两比较
            for(int j =0;j< array.length-i-1;j++) {
                if(array[j] > array[j+1]) {
                    long temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }

    /**
     * 选择排序：[无序][有序]
     * 每一次从无序区间中选出最大或最小的元素，放在无序区间的最后或最前
     * 时间复杂度：
     * 最好：O(n^2)
     * 最坏：O(n^2)
     * 平均：O(n^2)
     * 空间复杂度：O(1)
     * 不具备稳定性
     * @param array
     */
    public static void selectSort(long[] array) {
        //外部循环：有多少次选择
        for(int i =0;i<array.length-1;i++) {
            //无序区间：[0,array.length-i)
            //有序区间：[array.length -i,array.length)
            int maxIndex =0;//假设最大的数是array[0]
            //内部循环：找出最大的数
            for(int j = 1;j<array.length-i;j++) {
                if(array[j] >array[maxIndex]) {
                    maxIndex = j;
                }
            }
            //最大的数，和无序区间的最后一个进行交换
            long tmp = array[maxIndex];
            array[maxIndex] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
        }
    }

    /**
     * 堆排序：先建堆，交换，向下调整
     * 时间复杂度：最好/最坏/平均 O(n*log(n))
     * 空间复杂度：O(1)
     * 不具备稳定性
     * @param array
     */
    public static void heapSort(long[] array) {
        //1.建大堆
        createHeap( array,array.length);
        //选择，一共有array.length-1次
        for(int i = 0;i< array.length-1;i++) {
            //2.交换，array[0]和无序区间的最后一个元素
            //无序：[0,array.length-i)
            long tmp = array[0] ;
            array[0] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
            //3.向下调整，只在无序区间进行向下调整
            //无序：[0,array.length-i-1)
            shiftDown(array,array.length-i-1,0);
        }
    }
    //建堆
    public static void createHeap(long[] array,int size) {
        //从最后一个非叶子结点开始进行向下调整
        for(int i = (size-2)/2 ; i>=0; i--) {
            shiftDown(array,size,i);
        }
    }
    //向下调整
    public static  void shiftDown(long[] array,int size,int index ) {
        //leftIndex = 2*index+1
        while ( 2*index +1 < size) {//不是叶子结点
            int maxIndex = 2*index +1;
            //rightIndex < size(存在右孩子)，
            if(maxIndex+1 < size && array[maxIndex+1] > array[maxIndex]) {
                maxIndex ++;//最大的孩子是右孩子
                // maxIndex = maxIndex+1;
            }
            if(array[index] >= array[maxIndex]) {
                break;
            }

            long t =array[index];
            array[index] = array[maxIndex];
            array[maxIndex] = t;

            index = maxIndex;
        }
    }

    /**
     *希尔排序：分组，组内进行插排
     *  时间复杂度：最坏O(n^2),最好O(n),平均O(n^1.3)
     *  空间复杂度：O(1)
     *  不具备稳定性，在分组的时候很难保证相同的时候分到一个组里面，得到的结果就很难保证有序
     * @param array
     */
    public static void shellSort(long[] array) {
        int gap = array.length/2;
        while (true) {
            insertionGap(array,gap);
            if(gap == 1) {
                break;
            }
            gap = gap/2;
        }
    }
    //插排,带间隔
    public static void insertionGap(long[] array, int gap){
        for(int i =gap;i<array.length;i++) {
            long key = array[i];
            int j;
            for( j = i-gap;j>=0;j=j-gap) {
                if(key < array[j]) {
                    array[j+gap] = array[j];
                }else{
                    break;
                }
            }
            array[j+gap] = key;
        }
    }


    public static long[] 构建随机数组_带个数(int n) {
        Random random = new Random(20201024);
        long[] array = new long[n];
        for(int i =0;i < n;i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static long[] 构建完全有序数组_带个数(int n) {
        Random random = new Random(20201024);
        long[] array = new long[n];
        for(int i =0;i < n;i++) {
            array[i] = random.nextInt(100);
        }
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args) {
        Random random = new Random(20201024);
        long[] array = new long[10];
        for(int i =0;i < 10;i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));

     /*   //计算耗费时间
        long[] a1 = 构建随机数组_带个数(10000);
        //记录开始时间
        long begin = System.currentTimeMillis();//当前时间戳
        shellSort(a1);
        //记录结束时间
        long end = System.currentTimeMillis();

        long 耗费时间毫秒 = end -begin;
        System.out.println(耗费时间毫秒);*/
    }

}
