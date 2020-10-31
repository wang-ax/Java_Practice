package map的使用;

import java.util.Map;
import java.util.TreeMap;

/**
 * ClassName MapDemo
 * Description TODO
 * Author 30712
 * Date 2020-10-31
 * Time 10:14
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String , Integer> book = new TreeMap<>();
        //put方法
        Integer v = book.put("wax", 123);
        System.out.println(v);
        v = book.put("wax", 456);
        System.out.println(v);
        System.out.println(book);
        v = book.put("zs",678);
        System.out.println(v);
        v = book.put("zs",589);
        System.out.println(v);
        System.out.println(book);

        //get方法
        System.out.println(book.get("wax"));//返回wax对应的value值，456
        System.out.println(book.get("li"));//不存在，返回false
        //getOrDefault方法
        System.out.println(book.getOrDefault("wax",123456));//通过key获取对应的value值，456
        System.out.println(book.getOrDefault("li",123456));//key不存在，返回默认的defaultValue值
        System.out.println(book);//并不会修改集合本身的映射关系

        //remove方法:删除对应的映射关系
        System.out.println(book.remove("wax"));//key存在，返回对应的value值，456
        System.out.println(book.remove("li"));//key不存在，返回null
        System.out.println(book);//修改了集合

    }
}
