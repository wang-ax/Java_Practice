package day28.守形数;

import java.util.Scanner;

/**
 * ClassName day28.守形数
 * Description TODO
 * Author 30712
 * Date 2021-01-28
 * Time 10:56
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();//输入一个整数N
            //平方的低位部分等于本身
            boolean m = isConformal(n);
            if (m == true){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }

    private static boolean isConformal(int n) {
        //计算n的平方
        int sqrt = n*n;
        if (n < 10){
            if ((sqrt -n) % 10 == 0){
                return true;
            }else {
                return false;
            }
        }else {
            if ((sqrt -n) % 100 == 0){
                return true;
            }
        }
        return false;
    }
}
