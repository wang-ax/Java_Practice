package 在转动过的有序数组中寻找目标值;

/**
 * ClassName 在转动过的有序数组中寻找目标值
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 20:50
 */
public class Solution {
    public  static int search (int[] A, int target) {
        // write code here
       /* for (int i=0;i< A.length;i++){
            if (target == A[i]){
                return i;
            }
        }
        return -1;*/
        /**
         * 二分查找
         */
        if (A == null || A.length == 0){
            return -1;
        }
        int low = 0;
        int high = A.length-1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if (A[mid ]== target){
                return mid;
            }else if(A[mid] < A[high]){
                if (A[mid] < target && target <= A[high]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }else {
                if(A[low]<=target&&target<A[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1};
        int target = 0;
        System.out.println(search(arr, target));
    }
}
