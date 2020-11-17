package pratice;

import java.util.Scanner;

/**
 * ClassName Main1
 * Description TODO
 * Author 30712
 * Date 2020-11-17
 * Time 13:33
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double m = max(a+b,b,c)/(max(a,b+c,c)+max(a,b,b+c));
        System.out.println(m);
    }
    private static double max(double a, double b,double c) {
        double max = a>b ? a : b;
        return  max  > c ? max : c;
    }
}
