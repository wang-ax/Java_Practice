package list;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName ArrayToList
 * Description TODO
 * Author 30712
 * Date 2020-09-16
 * Time 18:44
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] sArray = {"hello","World"};
        List<String> strings = Arrays.asList(sArray);
        System.out.println(strings);
        System.out.println(strings.getClass());
    }
}
