package 网易;

import java.util.Scanner;

/**
 * ClassName 网易
 * Description TODO 算数
 * Author 30712
 * Date 2021-09-18
 * Time 19:40
 */

/**
 * 最少需要多少个形如2^x 的整数进行加减运算后才可以计算出n
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sunshu(n));

    }
    public static int sunshu(int n ){
        if ( n == 1){
            return n;
        }
        int count =0;
        if(n % 2 == 1){
            count++;
            n = n-1;
        }
        while ( n > 0 ){
            n = n/2;
        }
        if ( n == 0){
            count++;
        }
        return count;
    }
}
