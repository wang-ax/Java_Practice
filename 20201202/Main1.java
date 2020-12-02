package day9;

import java.util.Scanner;

/**
 * ClassName day9
 * Description TODO  末尾0的个数
 * 输入一个正整数n，求n的阶乘末尾有多少个0
 * Author 30712
 * Date 2020-12-02
 * Time 19:17
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fib = fid(n);
        int x = 0;
        int count =0;
        while (fib != 0) {
            x = fib %10;
            fib = fib/10;
            //x是从后往前的，如果碰到x==0就count++

            /*这个方法会把所有的0都打印出来
            if (x == 0) {
                count++;
            }*/
        }
        System.out.println(count);
    }
    public static int fid(int n) {
        if(n == 1 ) {
            return 1;
        }
        return n*fid(n-1);
    }
}
