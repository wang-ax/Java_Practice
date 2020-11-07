package pratice;

import java.util.Scanner;

/**
 * ClassName Main5
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 15:53
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine().toLowerCase();
            char ch = str.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}
