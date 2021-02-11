package 在排序数组中查找元素的第一个和最后一个位置;

import java.util.Arrays;

/**
 * ClassName 在排序数组中查找元素的第一个和最后一个位置
 * Description TODO
 * Author 30712
 * Date 2021-02-11
 * Time 10:52
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        //数组中第一个等于target的位置和第一个大于target的位置减一
        int leftIndex = binarySearch(nums,target);//利用二分查找寻找数组中第一个大于等于target的下标
        int rightIndex =binarySearch1(nums,target)-1;//在数组中寻找第一个大于target的下标
        if (leftIndex <= rightIndex && rightIndex < nums.length && nums[leftIndex] == target){
            return new int[]{leftIndex,rightIndex};
        }
        return new int[]{-1,-1};
    }
    //第一个大于等于target的下标
    public  int binarySearch(int[] nums ,int target){
      //二分查找
        int left =0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left +right)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                right = mid -1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
    //第一个大于target的下标
    public  int binarySearch1(int[] nums ,int target){
        int left =0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left +right)/2;
            if (nums[mid] > target){
                right = mid -1;
            }else {
                left = mid+1;
            }
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
