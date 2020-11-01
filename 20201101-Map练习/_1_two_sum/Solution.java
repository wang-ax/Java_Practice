package leetcode._1_two_sum;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-01
 * Time 18:47
 */

/**
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        //建立一个Map，存数值和下标,通过数值找到对应的下标
        Map<Integer,Integer> numToIndex = new TreeMap<>();
        //遍历数组 nums 中的数据
        for(int i =0;i< nums.length;i++) {
            int n = nums[i];
            int x = target - n;
            //如果n在numToIndex 中，就直接返回一个数组，数组中存的是n的下标和i
            if(numToIndex.containsKey(x)) {
                int oldIndex = numToIndex.get(x);
                return new int[]{oldIndex,i};
            }

            numToIndex.put(n,i);
        }

        return new int[]{0,0};//随便给定一个输出
    }
    /*public  static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIdx = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            int x = target - n;
            if (numToIdx.containsKey(x)) {
                int oIdx = numToIdx.get(x);
                return new int[] {oIdx, i};
            }

            numToIdx.put(n, i);
        }

        return new int[] {0, 0};
    }*/

    public static void main(String[] args) {
        int [] array ={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(array, 9)));

    }
}
