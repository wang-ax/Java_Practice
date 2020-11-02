package 判断整数奇偶性;

import java.util.EventListener;
import java.util.Scanner;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-02
 * Time 12:38
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }scanner.close();
    }
}
