package pratice;

import java.util.Scanner;

/**
 * ClassName Main4
 * Description TODO
 * Author 30712
 * Date 2020-11-17
 * Time 14:16
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(step(n));
    }
    private static int step(int n ) {
        if(n ==1) {
            return 1;
        }else if(n ==2) {
            return 2;
        }else {
            return step(n - 1) + step(n - 2);
        }
    }
}
