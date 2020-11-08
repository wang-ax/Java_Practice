/**
 * ClassName Main1
 * Description TODO
 * Author 30712
 * Date 2020-11-08
 * Time 13:34
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        if(str[0].equals(str[1])) {
            System.out.println("same");
        }else {
            System.out.println("different");
        }
    }
}
