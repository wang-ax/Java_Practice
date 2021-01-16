package 前n个数的和;

/**
 * ClassName 前n个数的和
 * Description TODO
 * Author 30712
 * Date 2021-01-16
 * Time 11:17
 */

/**
 * 求1+2+3+...+n，
 * 要求不能使用乘除法、for、while、if、else、
 * switch、case等关键字及条件判断语句（A?B:C）。
 */
//使用逻辑运算符
public class Solution {
    private static int result;
    public   static int Sum_Solution(int n) {
        /**
         *使用递归的方式
         */
        /*if (n ==1) {
            return n;
        }
        return  n+Sum_Solution(n-1);*/

        /**
         * 使用逻辑运算符计算
         */

        boolean x = n > 1 && (n+Sum_Solution(n-1)) > 0;
        result +=n;
        return  result;

    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(Sum_Solution(5));
    }
}
