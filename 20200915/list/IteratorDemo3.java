package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName IteratorDemo3
 * Description TODO
 * Author 30712
 * Date 2020-09-15
 * Time 23:24
 */
public class IteratorDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
//错误的，会报异常
       /* for(String next :list) {
            if(next.equals("C")) {
                list.remove("C");
            }
        }
        System.out.println(list);
    }*/
        //使用迭代器删除当前迭代到的元素
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if(next.equals("C")) {
                it.remove();//删除当前迭代的位置
            }
        }
        System.out.println(list);
        //A B D  E
    }

}
