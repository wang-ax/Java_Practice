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
            /**
             *情况没有考虑全面
             */
           /* int A = (arr[0] + arr[2])/2;
            int B = A -arr[0];
            int C = B -arr[1];
            System.out.print(A + " "+B +" "+ C+" ");*/
            int y1 = arr[0];
            int y2 = arr[1];
            int y3 = arr[2];
            int y4 = arr[3];
            float a =(y1 + y3)/2f;
            float b =(y3 - y1)/2f;
            float c =(y4 - y2)/2f;
            if((a - ((y1+y3)/2)) != 0){
                System.out.println("NO");
                return;
            }
            if((b-(y3-y1)/2) != 0 || (b != ((y2+y4)/2))){
                System.out.println("NO");
                return;
            }
            if((c-((y4 - y2)/2)) != 0){
                System.out.println("NO");
                return;
            }
            System.out.println((int)a +" "+(int)b +" "+(int)c);
        }
}
