package 汽水瓶;

import java.util.Scanner;

/**
 * ClassName 汽水瓶
 * Description TODO
 * Author 30712
 * Date 2021-02-23
 * Time 14:04
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n != 0){
                System.out.println(numbers(n));
            }else {
                break;
            }
        }
    }

    private static int  numbers(int n) {
        if (n > 0 && n < 3){
            return 0;
        }
        int count =0;
        while (n >=3){
            count = count+n/3;
            n = n/3+n%3;
        }
        if (n ==2){
            count++;
        }
        return count;
    }
}
