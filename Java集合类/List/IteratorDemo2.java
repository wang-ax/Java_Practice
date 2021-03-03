import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 18:24
 */
public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String > list  =new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator<String> iterator = list.iterator();
//        Iterator<String> iterator1 = list.iterator();
//        iterator.next();
//        iterator.next();
//        //同时存在多个迭代器，迭代器之间是相互独立的
//        System.out.println(iterator.next());//C
//        System.out.println(iterator1.next());//A


        //遍历的同时不能改变线性表的结构
        //抛出异常：java.util.ConcurrentModificationException
        /* for (String next : list){
            if (next.equals("C")){
                list.remove("C");
            }
        }*/
        //如果需要，应该使用迭代器进行遍历，使用迭代器中的remove()
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("C")){
                iterator.remove();
            }
        }
        System.out.println(list);//[A, B, D, E]
    }
}
