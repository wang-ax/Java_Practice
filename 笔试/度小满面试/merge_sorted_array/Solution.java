package 度小满面试.merge_sorted_array;

/**
 * ClassName 度小满面试.merge_sorted_array
 * Description TODO 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * Author 30712
 * Date 2021-09-04
 * Time 23:16
 */
public class Solution {
    /**
     * 双指针
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(m+n)
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int[] newArray = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n){
            if (nums1[i] < nums2[j]){
                newArray[k] = nums1[i];
                i++;
            }else {
                newArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        //nums1遍历完，nums2没有遍历完就把剩余的添加到数组中
        if (i >= m){
            while (j < n){
                newArray[k++] = nums2[j++];
            }
        }
        //nums2遍历完了，nums1剩余的添加到数组中
        if (j >= n){
            while (i < m){
                newArray[k++] = nums1[i++];
            }
        }
        //最终需要得到的是nums1数组是合并之后的数组
        for (int l =0;l<m+n;l++){
            nums1[l] = newArray[l];
        }
    }
}
