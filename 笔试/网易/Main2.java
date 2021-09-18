package 网易;

import java.util.HashSet;
import java.util.Scanner;

/**
 * ClassName 网易
 * Description TODO 超级键盘
 * Author 30712
 * Date 2021-09-18
 * Time 19:29
 */
public class Main2 {
    /**
     * 初始光标可以在任意位置
     * 方向键，可以花费一次操作左右移动光标(z-A -B-------Z-A)
     * 魔法键，花费依次操作，使光标移动到任何文职，要么一次不用，要么必须使用m次，这些操作必须使连续输入的中间可以插入确认键
     * 确认键，可以花费一次操作输出当前光标所在的字母
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int m = scanner.nextInt();
        char[] chars = s.toCharArray();
        minCount(chars,m);
    }
    public static int minCount(char[] chars,int m){
        HashSet<Character> set = new HashSet<>();
        for (int i =0;i< chars.length;i++){
            set.add(chars[i]);
        }
        if (set.size() == 1){
            return chars.length;
        }
        if (isHuiwen(chars)){
            return chars.length+2;
        }
        return 0;
    }
    public static boolean isHuiwen(char[] chars){
        int i =0;
        int j = chars.length-1;
        while (i < j){
            if (chars[i] != chars[j]){
                return false;
            }
        }
        return true;
    }
}
