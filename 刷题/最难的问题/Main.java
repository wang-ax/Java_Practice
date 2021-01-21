package day21.最难的问题;

import java.util.Scanner;

/**
 * ClassName 最难的问题
 * Description TODO
 * Author 30712
 * Date 2021-01-21
 * Time 16:54
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string  = scanner.nextLine();
            System.out.println(Encryption(string));
        }
    }

    private static StringBuilder Encryption(String string) {
        StringBuilder  stringBuilder = new StringBuilder();
        char c1 ;
        for (int i =0;i<string.length();i++){
            char c = string.charAt(i);
            if (c >='A' && c < 'F'){
                 c1 = (char)(c + 21);
                stringBuilder.append(c1);
            }else if( c > 'E' && c <= 'Z'){
                c1 = (char) (c-5);
                stringBuilder.append(c1);
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder;
    }
}
