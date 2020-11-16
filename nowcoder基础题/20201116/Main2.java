package pratice;

import java.util.Scanner;

/**
 * ClassName Main2
 * Description TODO
 * Author 30712
 * Date 2020-11-16
 * Time 23:27
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        for(int i =str.length-1;i>=0;i--) {
            int x = Integer.parseInt(str[i]);
            System.out.print(x+" ");
        }
    }
}
