package _905_按奇偶排序数组;

/**
 * ClassName _905_按奇偶排序数组
 * Description TODO
 * Author 30712
 * Date 2021-02-10
 * Time 2:12
 */
public class Solution {
    public  static int[] sortArrayByParity(int[] A) {
        //双指针
        //偶数在前，奇数在后
        int start =0;
        int end = A.length-1;
        while(start < end){
            if (A[start] % 2  > A[end] % 2 ){
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }
            if (A[start] % 2 == 0){
                start++;
            }
            if (A[end] % 2 == 1){
                end--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2};
        int[] result = sortArrayByParity(nums);
        for (int e :result){
            System.out.println(e);
        }
    }
}
