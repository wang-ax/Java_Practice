package fibonacci;

import java.util.Scanner;

/**
 * ClassName fibonacci
 * Description TODO
 * Author 30712
 * Date 2020-11-23
 * Time 23:34
 */
public class Solution {
    public static int Fibonacci(int n) {
        if(n == 0) {//第0项为0
            return 0;
        }else if(n == 1 || n==2) {//第一项为1，第二项为1
            return 1;
        }else {
            return Fibonacci(n-1)+Fibonacci(n-2);//n>=2,前面两项之和
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
    }
}
