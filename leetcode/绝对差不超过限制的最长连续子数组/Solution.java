package 绝对差不超过限制的最长连续子数组;

import java.util.TreeMap;

/**
 * ClassName 绝对差不超过限制的最长连续子数组
 * Description TODO
 * Author 30712
 * Date 2021-02-21
 * Time 22:32
 */
class Solution {
    //滑动窗口+有序的集合
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int n = nums.length;
        int left = 0, right = 0;
        int ret = 0;
        while (right < n) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            ret = Math.max(ret, right - left + 1);
            right++;
        }
        return ret;
    }
}
