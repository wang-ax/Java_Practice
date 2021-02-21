package 公平的糖果棒交换;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName 公平的糖果棒交换
 * Description TODO
 * Author 30712
 * Date 2021-02-21
 * Time 22:44
 */
public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        //sumA - x + y = sumB - y + x
        // 通过移项得到 x = y + (sumA - sumB)/2

        //首先将 A 中的所有元素都放到哈希表中(因为哈希表查找起来更快)，
        // 然后遍历数组 B，根据公式求出对应 x 的值，若该值在哈希表中存在则直接返回 {x, y}
        int[] ans= new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for(int i :A){
            sum1 +=i;
        }
        for(int j :B){
            sum2 +=j;
        }
        int count = (sum1-sum2)/2;
        Set<Integer> set = new HashSet<>();
        for (int num: A){
            set.add(num);
        }
        for (int y:B){
            int x = y+count;
            if (set.contains(x)) {

                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }
}
