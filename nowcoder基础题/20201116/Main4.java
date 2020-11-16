package pratice;
import  java.util.*;
/**
 * ClassName Main4
 * Description TODO
 * Author 30712
 * Date 2020-11-16
 * Time 23:36
 */
public class Main4 {
    //去重整数并排序
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] str = scanner.nextLine().split(" ");

        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i]= Integer.parseInt(str[i]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        Collections.sort(list);

        for(int i = 0;i<list.size();i++) {
            arr[i]=list.get(i);
            System.out.print(arr[i]+" ");
        }

    }
}
