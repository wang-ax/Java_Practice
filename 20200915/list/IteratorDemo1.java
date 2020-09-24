package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName IteratorDemo1
 * Description TODO
 * Author 30712
 * Date 2020-09-15
 * Time 23:09
 */
public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        //本质上可以被for each写法替代,
        // foreach 写法，本质上其实就是通过迭代器实现的，
        // 凡是支持Iterable 能力的容器，都可以使用 foreach 写法

        for(String next : list) {
            System.out.println(next);
        }


    }
}
