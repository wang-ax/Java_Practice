package day27.整数与IP地址间的转换;

import java.util.Scanner;

/**
 * ClassName day27.整数与IP地址间的转换
 * Description TODO
 * Author 30712
 * Date 2021-01-28
 * Time 9:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(ipToNum(str));
            String string = scanner.nextLine();
            System.out.println(numToIp(string));
        }
    }

    private static long ipToNum(String str) {
        //字符串分割
        String[] strings = str.split(",");
        return 0;
    }
    private static String numToIp(String string) {
        return string;
    }

}
