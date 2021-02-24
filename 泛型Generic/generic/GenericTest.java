package generic;

import java.util.*;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-24
 * Time 0:13
 */
public class GenericTest {
    /**
     * 在集合中使用泛型之前的情况：
     */
    public static void test1(){
        ArrayList list = new ArrayList();
        //存放学生的成绩
        list.add(89);
        list.add(78);
        list.add(88);
        list.add(97);
        //问题1：类型不安全
        list.add("Tom");
        for (Object score :list){
            //问题2：强制类型转换时，有可能出现类型准换异常
            int studentScore = (Integer) score;
            System.out.println(studentScore);
        }
    }
    /**
     * 在集合中使用泛型的情况:以ArrayList为例
     */
    public static void test2() {
       ArrayList<Integer> list =  new ArrayList<Integer>();
       list.add(78);
       list.add(89);
       list.add(97);
       list.add(76);
       //编译时，就会进行类型检查，保证数据的安全
       //list.add("Tom");
        //方式一：
        for (Integer score:list){
            //避免了强转的操作，就不会出现类型转换异常
            int stuScore = score;
            System.out.println(stuScore);
        }
        //方式二：迭代器
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 在集合中使用泛型的情况：以HashMap为例
     */
    public static void test3(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Tom",87);
        map.put("Jack",89);
        map.put("Mike",78);
        //map.put(123,"ABC");
        //泛型的嵌套
       Set<Map.Entry<String,Integer>> entries =  map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+"------"+value);
        }
    }
    public static void main(String[] args) {
       // test1();
        test2();
    }

}
