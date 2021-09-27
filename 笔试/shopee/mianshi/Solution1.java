package shopee.mianshi;

/**
 * ClassName shopee.mianshi
 * Description TODO 二分查找
 * Author 30712
 * Date 2021-09-27
 * Time 19:37
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int target = 4;
        System.out.println(search(arr, target));
    }
    public static  int search(int[] arr,int target){
        int i =0;
        int j = arr.length-1;
        while (i < j){
            int mid = (i+j)/2;
            if (arr[mid] > target){
                j = mid-1;
            }else if(arr[mid] < target){
                i = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
