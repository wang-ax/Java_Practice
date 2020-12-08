package day7;

import java.util.Scanner;

/**
 * ClassName day7
 * Description TODO   最小公倍数
 * Author 30712
 * Date 2020-12-01
 * Time 15:29
 */

/**
 * 能被A和B都整除的最小公倍数
 * 最小公倍数是两个数的成绩除以两个数的最大公约数
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        //先计算出两个数的最大公约数
        int x = Maxyinshu(A,B);
        int m = A*B;//两个数的乘积
        System.out.println(m/x);//最小公倍数是两个数的乘积除以两个数的最大公因数
    }

    private static int Maxyinshu(int a, int b) {
        //辗转相除法
        if(a < b){
            //交换a 和 b
            int t = a;
            a = b;
            b = t;
        }
        int c =a % b;
        while (c != 0) {
            a =b;
            b =c;
            c = a % b;
        }
        return b;
    }
}
