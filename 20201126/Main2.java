import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-11-26
 * Time 15:38
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //使用一个队列，遍历str1，如果不在str2中，就入队列，遍历完之后，队列中的元素全部输出
       // Queue<Character> queue = new LinkedList<>();
        char[] chars = str1.toCharArray();
        System.out.print(chars);
        System.out.println();
        for(int i =0;i<chars.length;i++) {
            //判断str2中是否含有c
            if(str2.indexOf(chars[i]) == -1) {
                System.out.print(chars[i]);
            }
/*            if(!str2.contains(String.valueOf(chars[i]))){
                System.out.print(chars[i]);
            }*/
        }
    }
}

