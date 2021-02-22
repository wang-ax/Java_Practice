package 寻找第K大;

/**
 * ClassName 寻找第K大
 * Description TODO
 * Author 30712
 * Date 2021-02-22
 * Time 21:03
 */
public class Solution {
    //使用快速排序的思想
    public int findKth(int[] a, int n, int K) {
        // write code here
        return findK1(a, 0, n-1, K);
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];

        while (left < right) {
            while (left < right && arr[right] <= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] >= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    public static int findK1(int[] arr, int left, int right, int k) {
        if (left <= right) {
            int pivot = partition(arr, left, right);

            if (pivot == k - 1) {
                return arr[pivot];
            } else if (pivot < k - 1) {
                return findK1(arr, pivot + 1, right, k);
            } else {
                return findK1(arr, left, pivot - 1, k);
            }
        }
        return -1;
    }
}
