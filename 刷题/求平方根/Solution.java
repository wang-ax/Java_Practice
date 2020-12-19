package 求平方根;

/**
 * ClassName 求平方根
 * Description TODO
 * Author 30712
 * Date 2020-12-19
 * Time 20:31
 */
public class Solution {
    public  static int sqrt (int x) {
        // write code here
        int m = (int)Math.sqrt(x);
        return m;
    }

    public static void main(String[] args) {
        int n =4;
        System.out.println(sqrt(n));
    }
}
