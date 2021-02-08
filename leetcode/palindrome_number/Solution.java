package _383_palindrome_number;

/**
 * ClassName _383_palindrome_number
 * Description TODO  回文数
 * Author 30712
 * Date 2021-02-08
 * Time 10:51
 */
//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
public class Solution {
    public boolean isPalindrome1(int x) {
        /**
         *
         */
        /*if (x < 0){
            return false;
        }
        String string = String.valueOf(x);
        char[] chars = string.toCharArray();
        for (int i =0;i<chars.length;i++){
            if (chars[i] != chars[chars.length-1-i]){
                return false;
            }
        }
        return true;*/

    }
    public boolean isPalindrome(int x) {
        /**
         *将数字的后半部分反转
         *将前半部分和后半部分比较
         */
        //负数不可能为会位数
        //如果数字的最后一位是0，为了使该数字为回文，则第一个数字也应该为0，只有0满足
        if ( x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int temp =0;
        while (x > temp){
            temp = temp*10 + x%10;
            x /= 10;
        }
        return x == temp || x == temp/10;
    }
}
