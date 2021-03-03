import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 18:03
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){//被调用6次
            System.out.println(iterator.next());//next被调用5次
        }
        //forEach本质上就是通过迭代器实现的
        //凡是支持Iterable能力的容器，都可以使用forEach
    }
}
