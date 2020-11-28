package day3;

import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO  字符串中找出连续最长的数字串
 * Author 30712
 * Date 2020-11-25
 * Time 22:14
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(LongNumberString(str));
    }

    private static String  LongNumberString(String s) {
       /* //遍历字符串，遇到数字开始count++直到遇到字符（怎么保存数字串呢），记录size，count变为0
        //遇到下一个数字时，再count++*/

        //遍历字符串，遇到数字count++，当为字符时count重置为0
        // end表示数字尾部，每次满足数字时，对max进行判断，当max小于于count时，更新max和end
        int count = 0;//记录数字串的长度
        int max =0;//数字串最大为多少？
        int end =0;//记录遇到的数字串结束时的下标
        char[] chars = s.toCharArray();
        for(int i =0;i<chars.length;i++) {
            if ( chars[i] >='0'&& chars[i] <= '9'){
                count++;
                if(max < count) {
                    max = count;
                    end =i;
                }
            }else{
                count =0;
            }
        }
       return  s.substring(end-max+1,end+1);
    }
}
