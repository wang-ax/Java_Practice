import java.util.Scanner;

/**
 * ClassName Main3
 * Description TODO
 * Author 30712
 * Date 2020-11-11
 * Time 10:48
 */
public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        int sum  =0;
        for(int i = 0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(str[i]);
            sum += arr[i];
        }
        int avg = sum/arr.length;
        if(avg >= 60) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
