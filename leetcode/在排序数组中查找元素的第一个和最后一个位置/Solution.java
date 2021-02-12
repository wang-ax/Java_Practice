package 在排序数组中查找元素的第一个和最后一个位置;

import java.util.Arrays;

/**
 * ClassName 在排序数组中查找元素的第一个和最后一个位置
 * Description TODO
 * Author 30712
 * Date 2021-02-11
 * Time 10:52
 */
//要求的时间复杂度为O（log（n））
public class Solution {
    //二分查找target是否存在,如果存在就返回数组下标，如果不存在就返回-1
    public int BinarySearch(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            //mid = left + (right -left)/2;//不会溢出
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                left = mid +1;
            }else if(nums[mid] < target){
                right = mid-1;
            }
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result  = new int[2];
        int leftIndex = getLeft(nums,target);
        int rightIndex =getRight(nums,target);
        result[0] =leftIndex;
        result[1] = rightIndex;
        return result;
    }
    //找左边界
    public  int getLeft(int[] nums ,int target){
        int left =0;
        int right = nums.length-1;
        int mid =0;
        while (left <= right){
             mid = (left+right)/2;
             if (nums[mid] == target){
                 right = mid-1;
             }else if(nums[mid] < target){
                 left = mid +1;
             }else if (nums[mid] > target){
                 right = mid -1;
             }
        }
        //边界情况
        if (left == nums.length || nums[left] != target ){
            return -1;
        }
        return left;
    }
   //找右边界
    public  int getRight(int[] nums ,int target){//5
        int left =0;
        int right = nums.length-1;
        int mid =0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target){
                left = mid+1;
            }else if (nums[mid] < target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid -1;
            }
        }
        //边界情况
        if ( right == -1 || nums[right] != target){
            return -1;
        }
        return right;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(solution.searchRange(nums, target)));
    }
}
