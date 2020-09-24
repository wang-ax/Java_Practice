package list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ClassName IteratorDemo4
 * Description TODO
 * Author 30712
 * Date 2020-09-16
 * Time 18:21
 */
public class IteratorDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
       ListIterator<String > it =  list.listIterator(list.size());

       while (it.hasPrevious()) {
           String previous = it.previous();
           System.out.println(previous);
       }
       while (it.hasNext()) {
           String next = it.next();
           System.out.println(next);
       }
    }
}
