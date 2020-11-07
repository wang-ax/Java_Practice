package pratice;

import java.util.Scanner;

/**
 * ClassName Main8
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 16:43
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            double t = scanner.nextDouble();
            if(t > 0) {
                System.out.println(1);
            }else if(t < 0) {
                System.out.println(0);
            }else{
                System.out.println(1.0/2);
            }
        }
    }
}
