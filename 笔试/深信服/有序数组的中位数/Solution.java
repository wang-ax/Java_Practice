package 深信服.有序数组的中位数;

/**
 * ClassName 深信服.有序数组的中位数
 * Description TODO
 * Author 30712
 * Date 2021-09-14
 * Time 19:22
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 获取两个有序数组的中位数，两个数组同为增序数组，数组类型都为Int型。
     假设两个数组的元素总个数为N，返回N/2
     * @param arr1 int整型一维数组 第一个有序数据组
     * @param arr2 int整型一维数组 第二个有序数据组
     * @return int整型
     */
    public int getMedia (int[] arr1, int[] arr2) {
        // write code here
        //有序数组的中位数
        int m = arr1.length;
        int n = arr2.length;
        int[] newArray = new int[m+n];
        int k =0;
        int i =0;
        int j =0;
        while (i < m && j < n){
            if(arr1[i] <= arr2[j]){
                newArray[k] = arr1[i];
                i++;
            }else {
                newArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        if (i >= m-1){
            while (j < n){
                newArray[k++] = arr2[j++];
            }
        }
        if (  j >= n-1){
            while (i < m){
                newArray[k++] = arr1[i++];
            }
        }
       if (k % 2 == 0){
           return newArray[k/2-1];
       }else {
           return newArray[k/2];
       }
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[] B = {5,6,7,8,9};
        Solution solution = new Solution();
        System.out.println(solution.getMedia(A, B));
    }
}
