package 二分查找;

import java.util.Scanner;

/**
 * ClassName 二分查找
 * Description TODO 实现有重复数字的有序数组的二分查找
 * Author 30712
 * Date 2020-12-19
 * Time 20:35
 */
public class Solution {
    /**
     *
     * @param n 数组长度
     * @param v  查找值
     * @param a  数组
     * @return 第一个大于查找值的下标，如果不存在，则返回数组长度—+1
     */
    public static int upper_bound_ (int n, int v, int[] a) {
            // write code here
            int result =0;
            for (int i =0;i<n;i++){
                if(a[i] >= v){
                    result = i+1;
                    break;//要判断的是第一个大于等于要查找的数的位置，因此如果出现这个数就直接跳出循环
                }
            }
            //先进行上面的判断，如果上面判断结束之后，还满足a[n-1] < v
            //那么就说明该数组中全部都是比要查找的数小的数，直接返回数组的长度+1
            if (a[n-1] < v){
                result = a.length+1;
            }
            return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//数组长度
        int v = scanner.nextInt();//查找的值
        int[] array = new int[n];
        for (int i =0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(array));
        System.out.println(upper_bound_(n,v,array));
    }
}
