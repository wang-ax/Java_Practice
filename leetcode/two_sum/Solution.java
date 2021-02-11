package two_sum;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * ClassName two_sum
 * Description TODO 找出和为目标值的两个整数，返回他们的数组下标
 * Author 30712
 * Date 2021-02-10
 * Time 13:23
 */
public class Solution {
    public  int[] twoSum(int[] nums, int target) {
        //建立一个Map，存数值和下标,通过数值找到对应的下标
        Map<Integer,Integer> numToIndex = new TreeMap<>();
        //遍历数组 nums 中的数据
        for(int i =0;i< nums.length;i++) {
            int n = nums[i];
            int x = target - n;
            //如果x在numToIndex 中，就直接返回一个数组，数组中存的是n的下标和i
            if(numToIndex.containsKey(x)) {
                int oldIndex = numToIndex.get(x);
                return new int[]{oldIndex,i};
            }
            numToIndex.put(n,i);
        }

        return new int[]{0,0};//随便给定一个输出
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
