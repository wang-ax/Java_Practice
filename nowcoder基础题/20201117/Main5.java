package pratice;

import java.util.*;

/**
 * ClassName Main5
 * Description TODO
 * Author 30712
 * Date 2020-11-17
 * Time 14:34
 */

/**
 * 对数组进行去重并排序，用TreeSet实现
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for(int i  =0;i<n;i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        Set<Integer> set = new TreeSet<>();
        for(int i =0;i< n;i++) {
            set.add(array[i]);
        }
        for(int i :set){
            System.out.print(i+ " ");
        }

    }
}
