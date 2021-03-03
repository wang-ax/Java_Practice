package 比特位计数;

import java.util.Arrays;

/**
 * ClassName 比特位计数
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 21:14
 */
public class Solution {
    public int[] countBits(int num) {
    //从0-num每个数字中二进制数中1的个数
         int[] res = new int[num+1];
         for(int i =0;i<=num;i++){
            res[i] = count1(i);
         }
         return res;
    }
    private int count1(int num){
        int count =0;
        while (num > 0){
            count++;
            num = num& (num-1);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n =5;
        System.out.println(Arrays.toString(solution.countBits(n)));
    }
}
