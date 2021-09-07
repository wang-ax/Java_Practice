package 奇安信.找卡片;

import java.util.Arrays;

/**
 * ClassName 奇安信.找卡片
 * Description TODO
 * Author 30712
 * Date 2021-09-07
 * Time 19:51
 */
public class Solution {
    public static int[] findNums (int[] nums) {
        // write code here

       /* Arrays.sort(nums);
        if (nums.length == 0 || nums == null){
            return new int[]{-1,-1};
        }
        int[] res = new int[2];

        for (int i = 0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1]){
                res[0] = nums[i];
                break;
            }
        }
        res[1] = res[0]+1;
        return res;*/

        if(nums.length == 0 || nums == null){
            return new int[]{-1,-1};
        }
        Arrays.sort(nums);
        int[] res = new int[2];
        for (int i = 0;i< nums.length;i++){
            if (nums[i] != i+1){
                res[0] = nums[i];
                res[1] = i+1;
                break;
            }
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,6};
        int[] nums1 = findNums(nums);
        for (int i : nums1){
            System.out.println(i);
        }

    }
}
