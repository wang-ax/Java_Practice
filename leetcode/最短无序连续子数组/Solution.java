package 最短无序连续子数组;

import java.util.Arrays;

/**
 * ClassName 最短无序连续子数组
 * Description TODO
 * Author 30712
 * Date 2021-02-14
 * Time 18:58
 */
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        /**
         * 时间复杂度：O(nlogn)
         * 空间复杂度：O(n)
         */
        int[] copyNum = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copyNum);
        int start = copyNum.length;
        int end =0;
        for (int i=0;i< copyNum.length;i++){
            if (copyNum[i] != nums[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        return (end - start >= 0 ? end-start+1 : 0);

        /**
         * 遍历，两次
         */
        /*int l = nums.length, r = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    r = Math.max(r, j);
                    l = Math.min(l, i);
                }
            }
        }
        return r - l < 0 ? 0 : r - l + 1;*/



    }

    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        Solution solution = new Solution();
        System.out.println(solution.findUnsortedSubarray(nums));
    }
}
