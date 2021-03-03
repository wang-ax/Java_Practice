import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 18:52
 */
public class IteratorDemo3 {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        ListIterator<String> s = list.listIterator(list.size());
        while (s.hasPrevious()){
            String pre = s.previous();
            System.out.println(pre);//D C B A
        }
    }
}
