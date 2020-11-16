package pratice;

import java.util.Scanner;

/**
 * ClassName Main1
 * Description TODO
 * Author 30712
 * Date 2020-11-16
 * Time 23:26
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        for(int i =0;i<str.length;i++) {
            int x = Integer.parseInt(str[i]);
            System.out.print(x+" ");
        }
    }
}
