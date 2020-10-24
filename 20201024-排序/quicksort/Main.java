package quicksort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        long[] a1 = BuildArray.构建随机数组();
        //打印数组，用Arrays.toString()方法
        System.out.println(Arrays.toString(a1));
        QuickSort.quicksort(a1);
        System.out.println(Arrays.toString(a1));


        long[] a2 = BuildArray.构建完全有序数组();
        System.out.println(Arrays.toString(a2));
        QuickSort.quicksort(a2);
        System.out.println(Arrays.toString(a2));

        long[] a3 = BuildArray.构建完全逆序数组();
        System.out.println(Arrays.toString(a3));
        QuickSort.quicksort(a3);
        System.out.println(Arrays.toString(a3));
    }
}
