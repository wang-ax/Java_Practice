package remove_duplicates_from_sorted_array;

/**
 * ClassName remove_duplicates_from_sorted_array
 * Description TODO
 * Author 30712
 * Date 2021-02-07
 * Time 9:07
 */
public class Solution {
    public  static  int removeDuplicates(int[] nums) {
       //快慢指针的方法
        int fast =0;
        int slow =0;
        for (fast =0;fast<nums.length;fast++){
            if (nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
