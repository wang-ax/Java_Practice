import java.util.ArrayList;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 17:22
 */
public class SubListDemo {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        System.out.println(list);
        System.out.println(list.subList(1,4));
    }
}
