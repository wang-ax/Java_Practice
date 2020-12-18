package 反转字符串;

import java.util.Scanner;
import java.util.Stack;

/**
 * ClassName 反转字符串
 * Description TODO
 * Author 30712
 * Date 2020-12-18
 * Time 19:34
 */
public class Main {
    public  static String solve (String str) {
        // write code here
        //使用栈，字符串转为字符，每个字符先入栈，再依次出栈
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<str.length();i++) {
            char x = str.charAt(i);
            stack.push(x);
        }
        //返回的是一个字符串
        char[] s = new char[str.length()];
        for(int i = 0;i<s.length;i++) {
            s[i]=stack.pop();
        }
        String string = String.valueOf(s);//将字符数组转为字符串
        //System.out.println(s);
        //返回的是一个字符串
        return  string;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solve(str));
    }
}
