/**
 * ClassName Main2
 * Description TODO
 * Author 30712
 * Date 2020-11-09
 * Time 23:37
 */
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            for(int i = 1;i<=n;i++) {
                for(int j =1;j<= i;j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
