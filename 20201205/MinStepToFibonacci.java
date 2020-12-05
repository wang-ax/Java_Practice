package day10;

import java.util.Scanner;

/**
 * ClassName day10
 * Description TODO
 * 输入一个正整数
 * 输出一个最小的步数变为Fibonacci数
 * Author 30712
 * Date 2020-12-03
 * Time 18:02
 */
public class MinStepToFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //循环生成斐波那契数
        //当生成的第一个数比n大时，此时离n最近的两个斐波那契数就得到了，比较这两个数和n的距离
        //返回与n之间距离小的数
        int first =0;//斐波那契数列的第一个数
        int second = 1;//第二个数
        if(n ==1){
            System.out.println("0");
            return;
        }
        while (true){
            //不断往后计算出斐波那契数
            int tmp = first;
            first = second;
            second = tmp + second;
            //找到n旁边的两个斐波那契数
            if(n >= first && n <= second){
                int step = Math.min(n-first,second-n);
                System.out.println(step);
                return;
            }
        }
    }
}
