package pratice;

import java.util.Scanner;

/**
 * ClassName Main4
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 15:39
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] str = scanner.nextLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            System.out.println(max(a, b, c));
        }
    }

    private static int  max(int x,int y,int z) {
        int max = Math.max(x, y);
        return Math.max(max, z);
    }

}
