package 哈希表的应用;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 20:38
 */
public class Main {
    public static void main(String[] args) {
        //HashSet
       /* Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);  //不保证顺序
        System.out.println(set.add(1));  //false
        System.out.println(set.remove(1));
        System.out.println(set.contains(2));
        System.out.println(set.contains(4));*/

        //HashMap
        Map<String ,Integer> map = new HashMap<>();
        System.out.println(map.put("wax", 123)); //返回null
        System.out.println(map.put("wax",456));  //返回123
        System.out.println(map.put("zch",234));
        System.out.println(map.put("wdc",345));
        System.out.println(map);
        for(String key :map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get("wax"));

        System.out.println(map.remove("zch"));


    }
}
