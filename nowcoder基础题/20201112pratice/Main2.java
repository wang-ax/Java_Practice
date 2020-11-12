import java.util.Scanner;

/**
 * ClassName Main2
 * Description TODO
 * Author 30712
 * Date 2020-11-12
 * Time 14:53
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            for(int i=n;i>0 ;i--) {
                for(int j = 0 ;j<i;j++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

        }
    }
}
