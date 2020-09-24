package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName SortDemo
 * Description TODO
 * Author 30712
 * Date 2020-09-15
 * Time 21:43
 */
public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(9);
        list.add(10);
        list.add(1);
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//升序
            }
        });
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//降序
            }
        });
        System.out.println(list);
    }
}
