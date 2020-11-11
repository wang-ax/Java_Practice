import java.util.Scanner;

/**
 * ClassName Main5
 * Description TODO
 * Author 30712
 * Date 2020-11-11
 * Time 11:14
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        String[] str = scanner.nextLine().split(" ");
        int[] arr= new int[n];
        int max = 0;
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(str[i]);
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
