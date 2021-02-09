package _88_merge_sorted_array;

/**
 * ClassName _88_merge_sorted_array
 * Description TODO
 * Author 30712
 * Date 2021-02-10
 * Time 1:45
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //合并两个有序数组，将nums2合并到nums1中，使nums1成为一个有序数组
        /**
         * 定义一个新数组，定义三个指针分别指向三个数组的第一个元素，
         * 比较两个数组的大小，将小的元素放入新数组，
         * 当一个数组放入结束后就将另一个全部放入新数组中，
         * 最后将新数组的元素赋值给nums1数组
         */
        int[] newArray = new int[m+n];
        int i=0;
        int j =0;
        int k =0;
        while (i < m && j < n){
            if (nums1[i] < nums2[j]){
                newArray[k++] = nums1[i++];
            }else {
                newArray[k++] = nums2[j++];
            }
        }
        //如果第一个数组遍历完，直接将第二个数组元素放入新数组
        if ( i >= m){
            while (j <n){
                newArray[k++] = nums2[j++];
            }
        }
        if (j <= n){
            while (i < m){
                newArray[k++] = nums1[i++];
            }
        }
        //将数组中的元素，依次赋给nums1
        for (int l = 0;l <newArray.length;l++){
            newArray[l] = newArray[k];
        }
    }
}
