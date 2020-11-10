import java.util.Scanner;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-10
 * Time 11:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            for(int i =n;i>=0 ;i--) {
                for(int j = 0 ;j<i;j++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }
}
