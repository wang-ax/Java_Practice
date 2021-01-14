package 和为S的两个数;

import java.util.ArrayList;

/**
 * ClassName 和为S的两个数
 * Description TODO
 * Author 30712
 * Date 2021-01-14
 * Time 9:34
 */
public class Solution {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int start =0;
        int end = array.length-1;
        //只使用了一个while循环，时间复杂度为O(n)
        while (start < end){
            if ((array[start]+array[end]) == sum){
                list.add(array[start]);
                list.add(array[end]);
                break;//找到这两个数，直接跳出循环
            }
            //由于该数组是一个已经排好序的递增的数组，因此，如果和大于要找的值就让end下标往前走
            if ((array[start]+array[end]) > sum){
                end--;
            }
            //和小于要找的数，让start下标往前走
            if ((array[start]+array[end]) < sum){
                start++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,7,11,15};
        int sum = 15;
        ArrayList<Integer> list = FindNumbersWithSum(array,sum);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
