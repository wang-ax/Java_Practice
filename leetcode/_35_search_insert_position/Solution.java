package _35_search_insert_position;

/**
 * ClassName _35_search_insert_position
 * Description TODO
 * Author 30712
 * Date 2021-02-07
 * Time 11:46
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                break;
            }
        }
        return i;
    }
}
