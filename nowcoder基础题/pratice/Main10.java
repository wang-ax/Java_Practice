package pratice;
import java.util.Scanner;
/**
 * ClassName Main10
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 17:19
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        while(scanner.hasNext()) {
            String[] str = scanner.nextLine().split(" ");
            double weight = Integer.parseInt(str[0]);
            double h =Integer.parseInt(str[1]);
            double height = h/100;
            double bmi = weight/(height*height);
            if(bmi < 18.7) {
                System.out.println("Underweight");
            }else if(bmi >= 18.5 && bmi <= 23.9) {
                System.out.println("Normal");
            }else if(bmi >23.9 && bmi <=27.9) {
                System.out.println("Overweight");
            }else{
                System.out.println("Obese");
            }
        }
    }
}
