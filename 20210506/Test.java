import java.util.ArrayList;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-05-21
 * Time 17:00
 */
public class Test {
    public static List<Integer> functionA(int[] array1 ,int[] array2){
        int i=0;
        int j =0;
        List<Integer> list = new ArrayList<>();
        while ((i < array1.length) && (j < array2.length)){
            if (array1[i] < array2[j]){
                i++;
            }else {
                if(array1[i] == array2[j]){
                    list.add(array1[i]);
                    i++;
                    j++;
                }else {
                    j++;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {2,3,4,5,6};
        System.out.println(functionA(array1,array2));
    }
}
