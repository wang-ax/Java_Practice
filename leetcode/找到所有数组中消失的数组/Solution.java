package 找到所有数组中消失的数组;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName 找到所有数组中消失的数组
 * Description TODO
 * Author 30712
 * Date 2021-02-13
 * Time 23:40
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i=0;i< n;i++){
            if (nums[Math.abs(nums[i]) -1] > 0){
                nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];
            }
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;

    }
}
