import java.util.Scanner;

/**
 * ClassName Main2
 * Description TODO
 * Author 30712
 * Date 2020-11-11
 * Time 10:44
 */
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        int max =0;
        for(int i = 0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(str[i]);
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
