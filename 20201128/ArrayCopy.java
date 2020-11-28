package day4.test;

import java.util.Arrays;

/**
 * ClassName day4.test
 * Description TODO
 * Author 30712
 * Date 2020-11-28
 * Time 23:24
 */
public class ArrayCopy {
    public static void main(String[] args) {
        //使用for循环逐一进行复制
        int[] arr1 = {1,2,3,5,8,9};
        int[] arr2 = new int[arr1.length];

        for(int i =0;i<arr1.length;i++) {
            arr2[i] = arr1[i];
        }
        long end_time = System.nanoTime();

        System.out.println(Arrays.toString(arr2));

        //使用clone方法
        arr2 = arr1.clone();
        System.out.println(Arrays.toString(arr2));
        //使用Array.copyOf
        arr2 = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr2));
        //使用 System.arraycopy
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr2));
    }

}
