package day9;

import java.util.Scanner;

/**
 * ClassName day9
 * Description TODO  数字颠倒
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * Author 30712
 * Date 2020-12-02
 * Time 19:04
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x =0;
        while ( n != 0){
            x = n %10;//得到最后一位数
            n = n/10;
            System.out.print(x);
        }
    }
}
