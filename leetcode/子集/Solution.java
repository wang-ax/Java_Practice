package 子集;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName 子集
 * Description TODO
 * Author 30712
 * Date 2021-02-14
 * Time 18:15
 */

/**
 * 所求的每一个子集都用到了上一个子集，使用递归算法
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());//要包括空集
        if (nums == null || nums.length == 0){
            return list;
        }

        fun(list,new LinkedList<>(),nums,0);

        return list;
    }

    public void fun(List<List<Integer>> ans,LinkedList<Integer> list,int nums[],int k){
        for(int i=k;i<nums.length;i++)
        {
            list.add(nums[i]);
            ans.add(new ArrayList<>(list));
            fun(ans,list,nums,i+1);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {};
        System.out.println(solution.subsets(nums));
    }

}
