package hashMapSort;
/**
 * 已知一个 HashMap<Integer， User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现对
 * HashMap 的排序功能，该方法接收 HashMap<Integer， User>为形参，返回类型为 HashMap<Integer， User>，
 * 要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散。
 */

import java.util.*;

/**
 * HashMap本身是无序的
 * LinkedHashMap是Map结构，也是链表结构，是有序的，是HashMap的子类
 */
class User{
    private String  name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class HashMapTest {
    public static HashMap<Integer,User> sortHashMap(HashMap<Integer,User> map){
        //首先拿到map的键值对的集合
        Set<Map.Entry<Integer,User>> entrySet = map.entrySet();

        //将set集合转为list集合，为了使用工具类的排序方法
        List<Map.Entry<Integer,User>> list = new ArrayList<Map.Entry<Integer, User>>(entrySet);

        //使用Collections集合工具类对list进行排序
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
               //按照题目根据User的age的倒序排列
                return o2.getValue().getAge()-o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<>();
        //将list中的数据存储在LinkedHashMap中
        for (Map.Entry<Integer,User> entry : list){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }

    public static void main(String[] args) {
        HashMap<Integer,User> users = new HashMap<>();
        users.put(1,new User("张三",14));
        users.put(3,new User("李四",25));
        users.put(2,new User("王五",30));
        System.out.println(users);

        HashMap<Integer,User> sortHashMap = sortHashMap(users);
        System.out.println(sortHashMap);

    }
}
