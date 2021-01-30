package day30.大整数排序;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName day30.大整数排序
 * Description TODO
 * Author 30712
 * Date 2021-01-30
 * Time 13:06
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();//n个整数
            BigInteger[] num = new BigInteger[n];
            for (int i =0;i< n;i++){
                num[i] = scanner.nextBigInteger();
            }
            Arrays.sort(num);
            for (BigInteger b : num){
                System.out.println(b);
            }
        }
    }
}
