import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-11-21
 * Time 17:45
 */
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<Integer> set = new TreeSet<>();//Set不仅是有序的还可以去重
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i =0;i<str.length;i++) {
            arr[i]= Integer.parseInt(str[i]);
            set.add(arr[i]);//元素添加到set中
        }
        //打印set中的各个元素
        for(int i :set) {
            System.out.print(i+" ");
        }
    }
}
