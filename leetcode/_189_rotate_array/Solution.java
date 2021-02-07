package _189_rotate_array;

/**
 * ClassName _189_rotate_array
 * Description TODO
 * Author 30712
 * Date 2021-02-07
 * Time 15:10
 */
public class Solution {
    public  static void rotate(int[] nums, int k) {
        if (k == 0|| nums.length ==1){
            return;
        }
        int n = k % (nums.length);
        reverse(nums,0,nums.length-1);
        reverse(nums,0,n-1);
        reverse(nums,n,nums.length-1);
    }
    private static void reverse(int[] nums, int i,int j) {
        //将数组中从i到j的元素进行翻转
        while (i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        /*int[] nums ={1,2};
        int  k =1;*/
        rotate(nums,k);
        for ( int i : nums){
            System.out.println(i);
        }
    }

}
