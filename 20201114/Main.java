/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-14
 * Time 21:42
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++) {
            String[] element = scanner.nextLine().split(" ");
            int j = 0;
            for(String e :element) {
                arr[i][j] = Integer.parseInt(e);
                j++;
            }
        }
        for(int i = 1;i<n;i++) {
            for(int j = 0;j < i;j++) {
                if(arr[i][j] != 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}
