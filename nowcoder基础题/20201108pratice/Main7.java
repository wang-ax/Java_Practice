import java.util.Scanner;

/**
 * ClassName Main7
 * Description TODO
 * Author 30712
 * Date 2020-11-08
 * Time 20:26
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int count =0;
        for (int a :array) {
            if(a == m) {
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
