package 自定义类使用HashMap和HashSet;

import java.util.HashMap;
import java.util.HashSet;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 20:44
 */
//自定义类不能作为map的key
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("as",12);
        Person p2 = new Person("as",12);

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        System.out.println(set.contains(p1));  //true

        System.out.println(set.contains(p2));
        //必须复写hashCode() 和equals() 方法后，返回true


        //value可以为自定义类
        HashMap<Person ,String> map = new HashMap<>();
        map.put(p1,"as");
        System.out.println(map.get(p2));
        //复写之后就可以返回对应的对象

    }

}
