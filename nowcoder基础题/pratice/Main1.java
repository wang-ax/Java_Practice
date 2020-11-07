package pratice;

import java.util.Scanner;

/**
 * ClassName Main1
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 15:08
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int m = Integer.parseInt(str[2]);
        int result = 0;
        if(m % h == 0) {
            result = n-m/h;
        }else{
            result = n-((m/h)+1);
        }
        System.out.println(result);
    }
}
