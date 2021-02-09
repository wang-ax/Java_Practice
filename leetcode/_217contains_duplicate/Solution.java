package _217contains_duplicate;

import java.util.Arrays;

/**
 * ClassName _217contains_duplicate
 * Description TODO
 * Author 30712
 * Date 2021-02-10
 * Time 0:21
 */
public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        /**
         * 排序，再遍历
         */
        Arrays.sort(nums);
        for (int i=1;i< nums.length;i++){
            if (nums[i-1] == nums[i]){
                return true;
            }
        }
        return false;

        /**
         *使用Set，Set具有去重的特性
         * 将数组中的元素依次放入数组中，如果最终set的大小和nums的长度相同，证明数组中没有重复的元素
         * 否则存在重复的元素
         */
        /*Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if (set.size() == nums.length){
            return false;
        }
        return true;*/

    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
