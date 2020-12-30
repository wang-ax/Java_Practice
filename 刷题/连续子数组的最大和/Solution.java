package 连续子数组的最大和;

/**
 * ClassName 连续子数组的最大和
 * Description TODO
 * Author 30712
 * Date 2020-12-30
 * Time 17:04
 */
public class Solution {
    public  static  int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        int currentSum =array[0];//目前的子数组之和
        int maxsetSum = array[0];//最大的子数组的和

        for (int i =1;i< array.length;i++){
            if (currentSum > 0) {//如果目前的子数组的和>0,就继续往后面加
                currentSum = currentSum + array[i];
            }else {//从array[i]开始往后加
                currentSum = array[i];
            }
            //如果现在的子数组之和大于最大的子数组之和，就交换
            if(currentSum > maxsetSum){
                maxsetSum = currentSum;
            }
        }
        return maxsetSum;
    }

    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        int result = FindGreatestSumOfSubArray(array);
        System.out.println(result);
    }
}
