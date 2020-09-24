package list;
import java.util.*;

/**
 * ClassName ListToArray
 * Description TODO
 * Author 30712
 * Date 2020-09-16
 * Time 18:32
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Object[] objects = list.toArray();
        for(Object o :objects) {
            String s = (String) o;
            System.out.println(s.toLowerCase());//转小写
        }

        //数组容量小于list.size()
        String[] sArray = new String[1];
        sArray[0] = "hello";
        String[] strings = list.toArray(sArray);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sArray));

         //数组容量 == list.size()
       /* String[] sArray = new String[5];
        //打印数组需要使用Arrays.toString
        String[] strings = list.toArray(sArray);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sArray));
        //strings 和 sArrays 指向同一个对象
        System.out.println(sArray == strings);*/


    }
}

