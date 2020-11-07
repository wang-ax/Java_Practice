package pratice;
import java.util.Scanner;
/**
 * ClassName Main2
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 15:17
 */
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            if(n >= 140) {
                System.out.println("Genius");
            }
        }
    }
}
