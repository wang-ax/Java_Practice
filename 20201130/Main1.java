package day5;

import java.util.Scanner;

/**
 * ClassName day5
 * Description TODO  神奇的口袋
 * Author 30712
 * Date 2020-11-28
 * Time 22:48
 */
public class Main1 {
    static  int[] weight;
    static  int n ;
    static  int count;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            n =input.nextInt();
            weight = new int[n+1];
            for(int i =1;i<=n;i++){
                weight[i] = input.nextInt();//将n个物品放入数组中
            }

            count(40,n);
            System.out.println(count);
        }

    }
    //s为剩余物品的重量，n为剩余可选的物品个数
    private static void count(int s, int n) {
        //如果正好装满
        if( s == 0) {
            count++;
            return;
        }
        //不能完成
        if(s < 0 || ( s>0 && n<1)){
            return;
        }
        count(s-weight[n],n-1);//装上weight[n]后，剩余物品仍然有解
        count(s,n-1);//装了weight[n]后，无解，删除该包，尝试第n-个
    }
}
