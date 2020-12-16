package 大数加法;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ClassName 大数加法
 * Description TODO 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
 * Author 30712
 * Date 2020-12-16
 * Time 18:43
 */
public class Solution {
    /**
     *
     * @param s：表示第一个整数
     * @param t：表示第二个整数
     * @return
     */
    public  static  String solve (String s, String t){
        // write code here
        //Java中提供了BigInteger
        BigInteger num1 = new BigInteger(s);
        BigInteger num2 = new BigInteger(t);
        String numInString = String.valueOf(num1.add(num2));//求和
        return numInString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(",");
        System.out.println(solve(str[0], str[1]));
    }
}
