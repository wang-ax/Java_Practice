package nowcoder._20_旧键盘;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-01
 * Time 20:13
 */
public class Main {
    public static void main(String[] args) {
        //输入实际输入的字符串和最终看到的输出
        Scanner scanner = new Scanner(System.in);
        String 实际输入 = scanner.nextLine();
        String 看到输出 = scanner.nextLine();

        //转大写
        实际输入 =实际输入.toUpperCase();
        看到输出 =看到输出.toUpperCase();

        //将看到输出的内容放在一个Set里面
        Set<Character> 看到输出的 = new TreeSet<>();
        char[] chars = 看到输出.toCharArray();
        for(char ch :chars) {
            看到输出的.add(ch);
        }

        //构建一个放错误按键的Set
        Set<Character> 错误按键 = new TreeSet<>();

        //遍历实际输入的内容，
        // 如果不包含在看到输出的结果中，就证明是错误的按键，增加到错误按键的Set中去
        char[] chars1 = 实际输入.toCharArray();
        for(char ch : chars1) {
            if (!看到输出的.contains(ch)) {
                if(!错误按键.contains(ch)) {
                    //说明ch是新发现的错误
                    System.out.print(ch);
                    错误按键.add(ch);
                }
            }
        }
        System.out.println();
    }
}
