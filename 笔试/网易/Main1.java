package 网易;

import java.util.Scanner;

/**
 * ClassName 网易
 * Description TODO 整除
 * Author 30712
 * Date 2021-09-18
 * Time 19:12
 */
public class Main1 {
    /**
     * 输出n中可以整除n的位数
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = n;
        int temp =0;
        int count =0;
        //得到该数的每一位数
        while (n > 0){
             temp = n%10;
             if (temp == 0){
                 n = n/10;
                 continue;
             }
             if(fun(res,temp) && temp > 0){
                 count++;
             }
             n = n/10;
        }
        System.out.println(count);
    }

    private static boolean fun(int n, int temp) {
        //判断是否能够整除
        if (n % temp == 0 && temp > 0 && n > 0){
            return true;
        }
        return false;
    }
}
