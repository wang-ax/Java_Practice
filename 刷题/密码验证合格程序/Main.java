package day28.密码验证合格程序;

import java.util.Scanner;

/**
 * ClassName day28.密码验证合格程序
 * Description TODO
 * Author 30712
 * Date 2021-01-28
 * Time 11:49
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String pw = scanner.nextLine();
            if (checkPassword(pw)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }
    //验证密码是否合格
    private static boolean checkPassword(String pw) {
        if (pw == null || pw.length() <= 8){
            return false;
        }
        if (checkTypes(pw) && checkRepeatSubString(pw)){
            return true;
        }
        return false;
    }

    private static boolean checkTypes(String pw) {
        //包括大小写字母、数字、其他符号，以上四种至少三种
        int upperCase =0,lowerCase =0,digit=0,other =0;
        for (Character ch :pw.toCharArray()){
            if (Character.isUpperCase(ch)) {
                upperCase = 1;
            } else if (Character.isLowerCase(ch)) {
                lowerCase = 1;
            } else if (Character.isDigit(ch)) {
                digit = 1;
            } else {
                other = 1;
            }
        }
        //至少有三种
        if (upperCase + lowerCase + digit + other >= 3) {
            return true;
        }
        return false;
    }
    private static  boolean checkRepeatSubString(String  pw){
        for (int i = 0; i < pw.length() - 3; i++) {
            String s = pw.substring(i, i + 3);
            String tempStr = pw.substring(i + 3, pw.length());
            if (tempStr.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
