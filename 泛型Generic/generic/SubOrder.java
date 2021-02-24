package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-24
 * Time 11:58
 */
public class SubOrder extends Order<Integer> {
    public static <T> List<T> copyFromArrayToList(T[] arr){
        ArrayList<T> list = new ArrayList<>();
        for (T t:arr){
            list.add(t);
        }
        return list;
    }
}
