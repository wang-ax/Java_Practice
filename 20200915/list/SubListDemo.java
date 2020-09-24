package list;

import java.util.ArrayList;
import java.util.List;
/**
 * ClassName SubListDemo
 * Description TODO
 * Author 30712
 * Date 2020-09-15
 * Time 20:38
 */
public class SubListDemo {
    public static void main(String[] args) {
        List <Character> list =new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        System.out.println(list);
        List<Character> sublist =list.subList(1,4); //返回下标从from 到 to 下标的内容，不会影响原线性表
        System.out.println(sublist);
        System.out.println(list);
    }
}
