package leetcode.single_number;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-31
 * Time 12:29
 */

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Solution {
    public int singleNumber(int[] nums) {
        //记录每个元素出现的次数
        //key：n为数组中的数，
        //value：count为元素出现的次数
        Map<Integer,Integer> num = new TreeMap<>();
        for(int n :nums) {
            int count = num.getOrDefault(n,0);
            count ++;
            num.put(n,count);
        }
        //找出count为1的数
        for(Map.Entry<Integer,Integer> entry : num.entrySet()) {
            int n = entry.getKey();
            int count = entry.getValue();
            if(count == 1) {
                return  n;
            }
        }
        return -1;
     }
    public int singleNumber2(int[] nums) {
        //0与数组中的元素进行异或
        int signal = 0;
        for(int n : nums) {
            signal ^= n;
        }
        return signal;
    }
}
