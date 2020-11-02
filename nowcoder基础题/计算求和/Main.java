package 计算求和;

import java.util.Scanner;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-02
 * Time 12:49
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0;i < n ;i++) {
            sum = sum +factor(i+1);
        }
        System.out.println(sum);
    }

    private static int factor(int n) {
        if(n == 1) {
            return 1;
        }
        return n*factor(n-1);
    }
}
