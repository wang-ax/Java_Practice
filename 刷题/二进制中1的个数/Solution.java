package 二进制中1的个数;

import java.util.Scanner;

/**
 * ClassName 二进制中1的个数
 * Description TODO
 * Author 30712
 * Date 2020-12-17
 * Time 21:29
 */
public class Solution {
    public static int NumberOf1(int n) {
        //二进制中1的个数
        int count =0;
        while (n != 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(NumberOf1(n));
        }
        scanner.close();
    }
}
