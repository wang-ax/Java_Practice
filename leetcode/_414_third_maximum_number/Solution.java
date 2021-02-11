package _414_third_maximum_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName _414_third_maximum_number
 * Description TODO 第三大的数
 * Author 30712
 * Date 2021-02-10
 * Time 13:08
 */
public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        List<Integer> list = new ArrayList<>();
        for (int i=nums.length-1;i>=0;i--){
            if (!list.contains(nums[i])){
                list.add(nums[i]);
            }
            if (list.size() == 3){
                return list.get(2);
            }
        }
        return nums[nums.length-1];//返回最大值
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.thirdMax(new int[] {1,2,3,4,5,6,7,8}));
    }
}
