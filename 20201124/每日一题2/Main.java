package 每日一题2;

import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO  汽水瓶
 * 三个空的汽水瓶可以换一瓶汽水。如果有n个空的汽水瓶，最多可以换多少瓶汽水
 * Author 30712
 * Date 2020-11-24
 * Time 14:02
 */
public class Main {
    public static  int numbers (int n ) {
        if(n > 0 && n < 3) {
            return 0;
        }
        int count =0;
        while (n >= 3) {
           count = count + n/3;//能喝到n/3 瓶汽水
           n = n/3 + n%3;//还剩的空瓶子数
        }
        if(n ==2) {
            count ++;
        }
        return  count;
    }
    public static void main(String[] args){
        int x =0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
             if(n!= 0) {
                x= numbers(n);
                System.out.println(x);
            }
             if(n==0) {
                 break;
             }
        }
    }
}
