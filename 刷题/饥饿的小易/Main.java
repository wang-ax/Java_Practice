package day15.饥饿的小易;

/**
 * ClassName day15.饥饿的小易
 * Description TODO
 * Author 30712
 * Date 2020-12-12
 * Time 20:15
 */

import java.util.Scanner;

/**
 * f(x) = 4*x+4
 * g(x) = 8*x+7
 * 规律：
 * 1.g(f(x))=f(g(x))即f和g的执行顺序没有影响
 * 2.f(f(f(x)))=g(g(x))即做3次f的变换等价于2次g的变换
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x0 = scanner.nextLong();//初始位置
        long m = 1000000007;
        long s = 100000;//神秘力量使用的次数

        long[] begin = new long[3];//f(x)=4x+3 执行3次
        //3次的取值
        begin[0] = x0;
        begin[1] = (4 * begin[0]+3)%m;
        begin[2] = (4 * begin[1]+3)%m;

        long minStep = s;
        long cur =0;
        int step = 0;//执行的次数
        for (int i =0;i< 3;i++){
            cur = begin[i];
            step =i;
            while (cur !=0 && step < minStep){
                cur = (8*cur +7)% m;
                step ++;
            }
            minStep = minStep < step ?minStep : step;

        }
        if (minStep < s){//执行步长没有超过s输出最小步长
            System.out.println(minStep);
        }
    }
}
