package day33.上楼梯;

import java.util.Scanner;

/**
 * ClassName day33.上楼梯
 * Description TODO
 * Author 30712
 * Date 2021-02-03
 * Time 18:51
 */
public class Main {
    public  static int countWays(int n) {
        // write code here
        //一次可以上1，2，3
        //1,1
        //2，2
        //3，4
        //4，1+2+4
        if (n ==1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3){
            return 4;
        }
        long a1 = 1;
        long a2 =2;
        long a3 = 4;
        //不能使用递归，使用递归会出现StackOverflowError
        //使用递归调用的次数太多
        //return (countWays(n-1)+countWays(n-2)+countWays(n-3))%1000000007;
        //使用动态规划
        for (int i =4;i<=n;i++){
            long t = a1;
            a1 = a2;
            a2 = a3;
            a3 = (t+a1+a2)%1000000007;
        }
        return (int)a3;
        //100000
        //使用int类型的得到的结果，86283405
        //使用long类型：111787461
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(countWays(n));
        }
    }
}


