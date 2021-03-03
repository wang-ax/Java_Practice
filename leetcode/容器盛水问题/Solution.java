package 容器盛水问题;

/**
 * ClassName 容器盛水问题
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 20:20
 */
public class Solution {
    /**
     * 容器水量等于每个位置的水量之和
     * 每个位置的水量=min{当前位置左边高度最大值，当前位置右边高度最大值}-当前位置高度
     */
    public long maxWater (int[] arr) {
        // write code here
        //
        if (arr == null || arr.length <=2){
            return 0;
        }
        int n  = arr.length;
        long[] water = new long[n];//存储每个位置的水量

        int i =1;
        int j = n-2;
        long leftMax = arr[0];//左边高度的最大值
        long rightMax = arr[n-1];//右边高度的最大值
        //维护两个指针
        while (i <= j){
            if (leftMax < rightMax){
                water[i] = leftMax- arr[i]>0 ? leftMax- arr[i]:0;
                leftMax = Math.max(leftMax,arr[i]);
                i++;
            }else {
                water[j] = rightMax - arr[j]>0 ?rightMax - arr[j]:0 ;
                rightMax = Math.max(rightMax,arr[j]);
                j--;
            }
        }
        //遍历相加
        long result =0;
        for (int k =1;k <n-1;k++){
            result+= water[k];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] arr = {3,1,2,5,2,4};
        System.out.println(solution.maxWater(arr));
    }
}
