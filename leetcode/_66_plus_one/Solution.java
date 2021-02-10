package _66_plus_one;

import java.util.Arrays;

/**
 * ClassName _66_plus_one
 * Description TODO 加1
 * Author 30712
 * Date 2021-02-10
 * Time 10:32
 */
//进位：

public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length ==0){
            return digits;
        }
        int carry =1;
        for (int i =digits.length-1;i>=0;i--){
            int value = digits[i]+carry;
            digits[i] = value%10;
            carry = value/10;
        }
        if(carry == 1){
            int[] result = new int[digits.length+1];
            result[0] =1;
            for (int i=1;i<result.length;i++){
                result[i] = digits[i-1];
            }
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1,4,3,9})));
    }
}
