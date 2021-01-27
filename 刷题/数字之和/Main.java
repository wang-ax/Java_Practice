package day26.数字之和;

import java.util.Scanner;

/**
 * ClassName day26.数字之和
 * Description TODO
 * Author 30712
 * Date 2021-01-27
 * Time 14:11
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();//输入的整数
            //求一个整数的各位数字之和
            int sum1 = sum(n);
            int sum2 = sum(n*n);
            System.out.print(sum1+" "+sum2);
            System.out.println();
        }

        //System.out.println(sum(144));
    }
    //求一个整数的各位数字之和
    private static int sum(int n) {
        int sum =0;
        while ( n != 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
