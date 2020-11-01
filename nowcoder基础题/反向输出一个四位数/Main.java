package 反向输出一个四位数;

import java.util.Scanner;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-01
 * Time 10:37
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        for(int i = chars.length-1;i>=0 ;i--) {
            System.out.print(chars[i]);
        }
    }
}
