import java.util.Scanner;

/**
 * ClassName Main2
 * Description TODO
 * Author 30712
 * Date 2020-11-10
 * Time 12:27
 */
public class Main2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum =0;
        for(int i = 1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

