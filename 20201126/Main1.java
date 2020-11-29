package day4;

import java.util.Scanner;

/**
 * ClassName day4
 * Description TODO 买苹果
 * Author 30712
 * Date 2020-11-28
 * Time 20:50
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(MinCount(n));
    }

    private static int  MinCount(int n) {
        //得到的正确结果一定是偶数，如果是奇数直接return -1
        //偶数个数对8取模，结果只可能是0，2，4，6
        //余数是0或6，
        //余数位4
        //余数位2
        if(n %2 != 0 || n == 10 || n <6) {
            return -1;
        }
        if( n % 8 == 0) {
            return n/8;
        }
        return  1+n/8;

       /* int count =0;
        while (n > 6) {
            count = count + n/8;//是8 的倍数
        }
        if(n == 6) {
            count ++;
            return count;
        }
        return -1;*/
/*        int count =0;
        while (n> 6) {
            count = count + n/8;
            n = n/8+n%6;
        }
        count++;
        return count;*/
/*
        if(n % 8 == 0) {
            return n/8;
        }else if(n % 6 == 0) {
            return n/6;
        }else {

        }
        return -1;
*/
    }
}
