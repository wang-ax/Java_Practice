package 寻找数组的中心索引;

/**
 * ClassName 寻找数组的中心索引
 * Description TODO
 * Author 30712
 * Date 2021-02-16
 * Time 16:58
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        //左侧所有元素相加的和等于右侧所有元素相加的和
        //左侧之和+右侧之和+当前中间元素（中心索引）= 数组所有的元素之和
        //2*左侧元素之和 + 中心索引 = 数组元素之和
        int sum =0;
        int leftSum =0;

        for (int i=0;i< nums.length;i++){
            sum +=nums[i];
        }
        for (int i =0;i< nums.length;i++){
            if( 2* leftSum + nums[i] == sum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
