package day24.小易的升级之路;

import java.util.Scanner;

/**
 * ClassName day24.小易的升级之路
 * Description TODO
 * Author 30712
 * Date 2021-01-25
 * Time 15:47
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        while (scanner.hasNext()){
            int n = scanner.nextInt();//怪物的数量
            int a = scanner.nextInt();//小易的初始能力值
            int c =a;
            int[] b = new int[n];
            for (int i= 0; i<n;i++){
                b[i] = scanner.nextInt();
                if (b[i] <= c ){
                    c +=b[i];
                }else {
                    //求出最大公约数
                    c +=GetGCD(c,b[i]);
                }
            }
            System.out.println(c);
        }
    }

    private static int GetGCD(int a, int b ) {
        //求最大公约数
        //辗转相除法b
        while (b !=0){
            int i =a %b;
            a =b;
            b=i;
        }
        return a;
    }
}
