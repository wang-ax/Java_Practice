package 字符串中找出连续最长的数字串;

import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-06
 * Time 19:52
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String str = scanner.nextLine();
            System.out.println(MaxLengthNumbers(str));

    }

    private static String MaxLengthNumbers(String str) {
        int count = 0;//数字串的长度
        int max =0;//最大数字串的长度
        int last =0;
        char[] chars = str.toCharArray();
        for(int i =0;i<chars.length;i++) {
            if ( chars[i] >='0'&& chars[i] <= '9'){
                count++;
                if(max < count) {
                    max = count;
                    last =i;
                }
            }else{
                count =0;
            }
        }
        return  str.substring(last-max+1,last+1);
    }

}
