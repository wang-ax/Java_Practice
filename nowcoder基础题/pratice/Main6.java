package pratice;

import java.util.Scanner;

/**
 * ClassName Main6
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 16:14
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str= scanner.next();
            char ch = str.charAt(0);
            if( ch >='A' && ch <='Z') {
                System.out.println(str.toLowerCase());
            }else{
                System.out.println(str.toUpperCase());
            }
        }
    }
}
