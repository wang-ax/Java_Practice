package 整数中1出现的次数;

/**
 * ClassName 整数中1出现的次数
 * Description TODO
 * Author 30712
 * Date 2021-01-12
 * Time 13:53
 */
public class Solution {
    public  static int NumberOf1Between1AndN_Solution(int n) {
        int count =0;
        for (int i =1;i<=n;i++){
            //计算1的个数
            int number = Number1(i);
            count = count +number;
        }
        return count;
    }
    private  static int Number1(int i) {
        //计算一个数中1的个数
        int count =0;
        //一个整数各个位的数字
        while (i != 0){
            int x = i %10;
            if (x ==1){
                count++;
            }
            i =i/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
}
