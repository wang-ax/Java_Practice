package day27.找x;

import java.util.Scanner;

/**
 * ClassName day27.找x
 * Description TODO
 * Author 30712
 * Date 2021-01-28
 * Time 9:23
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();//总共有n个数
            int[] nums = new int[n];
            for (int i =0;i < n;i++){
                nums[i] = Integer.parseInt(scanner.next());
            }
            int x = scanner.nextInt();
            int m =-1;
            for (int i =0;i< n;i++){
                if (x == nums[i]){
                    m =i;
                    System.out.println(m);
                }
            }
            if (m ==-1){
                System.out.println(-1);
            }
        }
    }
}
