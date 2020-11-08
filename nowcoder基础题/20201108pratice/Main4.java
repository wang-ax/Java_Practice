import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName Main4
 * Description TODO
 * Author 30712
 * Date 2020-11-08
 * Time 19:38
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//
        int[] array = new int[n];
        for(int i = 0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int a :array) {
            if(a != x) {
                list.add(a);
            }
        }
        System.out.println(list.size());
        for(int i =0;i<list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
