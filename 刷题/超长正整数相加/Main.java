package day13;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ClassName day13
 * Description TODO
 * Author 30712
 * Date 2020-12-10
 * Time 19:14
 */

/**
 * 使用BigInteger可以直接进行大整数的计算
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.next();
            String s2 = scanner.next();
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}
