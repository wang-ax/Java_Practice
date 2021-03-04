package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName arrayList
 * Description TODO
 * Author 30712
 * Date 2021-03-04
 * Time 10:34
 */
public class ArrayListTestDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        List<String> list2 = Arrays.asList("我","爱","中国");

        List<String> list3 = list2;//让list3指向list2目前指向的对象
        List<String> list4 = new ArrayList<>(list3);//构造了新的对象，完全复制

        list3.set(0,"你");
        System.out.println(list2);//[你, 爱, 中国]
        System.out.println(list3);//[你, 爱, 中国]
        System.out.println(list4);//[我, 爱, 中国]

    }
}
