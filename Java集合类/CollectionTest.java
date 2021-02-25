import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-25
 * Time 11:44
 */
public class CollectionTest {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        //使用isEmpty和size
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

        //add操作，进行尾插
        collection.add("我");
        collection.add("和");
        collection.add("你");
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

        //toArray转换为数组
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));

        //for Each遍历
        for (String  s: collection){
            System.out.println(s);
        }

        //使用contains
        boolean res = collection.contains("我");
        System.out.println(res);

        //使用remove删除
        collection.remove("和");
        for (String s : collection){
            System.out.println(s);
        }
    }
}
