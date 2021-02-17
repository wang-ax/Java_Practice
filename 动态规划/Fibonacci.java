/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-17
 * Time 11:00
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        /**
         * 递归
         */
        /*if(n == 0) {//第0项为0
            return 0;
        }else if(n == 1 || n==2) {//第一项为1，第二项为1
            return 1;
        }else {
            return Fibonacci(n-1)+Fibonacci(n-2);//n>=2,前面两项之和
        }*/
        /**
         * 动态规划
         */
        /*int[] arr = new int[n+1];
        arr[1] =1;
        for (int i =2;i <=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];*/
        /**
         *
         */
        int fn2 = 0;
        int fn1 = 1;
        int fn =0;
        if (n <=1){
            return n;
        }
        for (int i =2;i<=n;i++){
            fn = fn1+fn2;//状态转移方程
            fn2 = fn1;
            fn1 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.Fibonacci(4));
    }
}
