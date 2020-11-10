import java.util.Scanner;

/**
 * ClassName Main3
 * Description TODO
 * Author 30712
 * Date 2020-11-10
 * Time 22:52
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        double sum =0;
        for(int i =0;i<str.length;i++) {
            sum +=Double.parseDouble(str[i]);
        }
        System.out.printf("%.2f",sum/5);
    }
}
