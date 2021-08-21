package StringGame;

import java.util.Scanner;

/**
 * ClassName StringGame
 * Description TODO 字符串游戏
 * Author 30712
 * Date 2021-08-21
 * Time 16:26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings1 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(strings1[0]);
        String s = strings1[1];
//        int n = scanner.nextInt();
//        String s = scanner.next();
        int length = s.length();
        String sub = null;
//        sub = s;
        StringBuilder stringBuilder = null;
        for (int i=0;i<n;i++){
            String[] strings = scanner.nextLine().split(" ");

            int n1 = Integer.parseInt(strings[0]);
            if (n1 == 1){
                int k = Integer.parseInt(strings[1]);
                sub = s.substring(0, length - k);
            }
            if (n1 == 2){
                sub = reverse(sub);
            }
            if (n1 == 3){
                stringBuilder = new StringBuilder(sub);
                stringBuilder.append(strings[1]);
                sub = stringBuilder.toString();
            }
        }
        System.out.println(sub);
    }

    private static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i= s.length()-1;i>=0;i--){
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
