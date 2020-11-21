import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-11-21
 * Time 19:03
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入升序排列的整数的个数
        int n = Integer.parseInt(scanner.nextLine());
        String[] str = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<str.length;i++) {
            list.add(Integer.parseInt(str[i]));
        }
        int x = Integer.parseInt(scanner.nextLine());
        list.add(x);
        Collections.sort(list);//排序
        //输出list中的元素
        for(Integer s : list) {
            System.out.print(s + " ");
        }

    }
}
