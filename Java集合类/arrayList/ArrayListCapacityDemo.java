package arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName arrayList
 * Description TODO
 * Author 30712
 * Date 2021-03-04
 * Time 10:49
 */
public class ArrayListCapacityDemo {
    public static void main(String[] args) {
        //顺序表的下标和容量无关，和size有关
        List<String> list = new ArrayList<>(100);//容量是100
        System.out.println(list.size());//size是0
        list.set(98,"hello");//数组下标越界
    }
}
