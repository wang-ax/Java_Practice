package day6;

import java.util.Scanner;

/**
 * ClassName day6
 * Description TODO
 * Author 30712
 * Date 2020-11-29
 * Time 23:17
 */
public class Main2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] str = scanner.nextLine().split(" ");
            int[] arr = new int[str.length];
            for(int i =0;i<arr.length;i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int A = (arr[0] + arr[2])/2;
            int B = A -arr[0];
            int C = B -arr[1];
            System.out.print(A + " "+B +" "+ C+" ");
        }
}
