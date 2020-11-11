import java.util.Scanner;

/**
 * ClassName Main1
 * Description TODO
 * Author 30712
 * Date 2020-11-11
 * Time 10:17
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] str = scanner.nextLine().split(" ");
            double a = Double.parseDouble(str[0]);
            double b = Double.parseDouble(str[1]);
            double c = Double.parseDouble(str[2]);
            result(a,b,c);
        }
    }
    private static void result(double a,double b,double c) {
        double  z = b*b-4*a*c;
        if (a!=0){
            if(z==0){
                System.out.printf("x1=x2=%.2f",-b/2/a);
            }else if(z>0){
                Double x1=(-b-Math.sqrt(z))/2/a;
                Double x2=(-b+Math.sqrt(z))/2/a;
                System.out.printf("x1=%.2f;x2=%.2f",x1,x2);
            }else {
                Double shi=-b/2/a;
                Double xu=Math.sqrt(-z)/2/a;
                System.out.printf("x1=%.2f-%.2fi;x2=%.2f+%.2fi",shi,xu,shi,xu);
            }
        }else {
            System.out.println("Not quadratic equation");
        }
    }
}
