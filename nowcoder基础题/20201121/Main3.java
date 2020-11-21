import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-11-21
 * Time 18:02
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  str = scanner.nextLine();
        //str.charAt()返回这个字符串的指定索引处的char值
        // str.indexOf()指定字符串在字符串中首次出现的位置
        System.out.println(str.charAt(str.indexOf(".") - 1));
    }
}
