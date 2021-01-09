import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 15:58
 */
public class Test7 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if( n > 1000){
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for(int i  = 0;i<n;i++) {
                list.add(i);
            }
            int i = 0;
            while(list.size() > 1){
                i = (i+2)% list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
    }
}
