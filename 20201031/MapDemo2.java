package map的使用;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName MapDemo2
 * Description TODO
 * Author 30712
 * Date 2020-10-31
 * Time 11:40
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String > m =  new TreeMap<>();
        m.put("B","豹子头");
        m.put("A","花和尚");
        m.put("C","行者");
        m.put("D","及时雨");
        m.put("E","及时雨");

        //返回所有key的不重复集合
        Set<String> keys = m.keySet();
        System.out.println(keys);

        //返回所有value的可重复集合
        Collection<String> values = m.values();
        System.out.println(values);

        //遍历m
        for(String key:keys) {
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("========================================");

        //返回所有的key-value映射关系
        Set<Map.Entry<String, String>> entries = m.entrySet();
        System.out.println(entries);

        for(Map.Entry<String ,String> e :entries) {
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key + "="  + value);
        }

    }
}
