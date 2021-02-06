package day36.进制准换;

import java.util.Scanner;

/**
 * ClassName day36.进制准换
 * Description TODO
 * Author 30712
 * Date 2021-02-06
 * Time 10:44
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            //十六进制的字符串，转为十进制的数字
            String string2 = str.substring(2,str.length());
            int result = Integer.parseInt(string2,16);
            System.out.println(result);
        }
    }
}
