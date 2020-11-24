package 每日一题1;

import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO 统计回文
 * 两个字符串，将B字符串插到A字符串中，寻找有多少种插入办法可以使新字符串是一个回文串
 * Author 30712
 * Date 2020-11-24
 * Time 15:10
 */
public class Main {
    public  static int methods (String a , String  b) {
        //输入一个字符串，以及要插入的字符串
        //字符串的插入方式有 a.length +1
        int count =0;//回文串的个数
        for(int i =0;i<=a.length();i++){
            //进行字符串插入
            //当对字符串进行修改的时候，需要使用StringBuffer 和StringBuilder类
            StringBuffer str = new StringBuffer(a);//String 类型不能改变
            str.insert(i,b);
            //判断是不是回文结构
           if(Ispalin(str.toString())) {//str.toString()返回表示该序列中的数据的字符串。
               count++;
           }
        }
        return count;
    }

    private static boolean Ispalin(String str) {
        //回文结构，第一个等于最后一个，i++ length--
        int  i =0;
        int j = str.length()-1;
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        System.out.println(methods(A,B));
    }
}
