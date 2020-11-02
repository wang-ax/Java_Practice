package p35_判断字母;

import java.util.Scanner;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-02
 * Time 22:03
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str= scanner.next();
            char c = str.charAt(0);
            if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
