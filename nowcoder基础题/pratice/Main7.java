package pratice;

import java.util.Scanner;

/**
 * ClassName Main7
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 16:21
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a == b) {
                System.out.println(a +"=" +b);
            }else if(a>b) {
                System.out.println(a + ">"+b);
            }else{
                System.out.println(a + "<"+b);
            }
        }
    }
}
