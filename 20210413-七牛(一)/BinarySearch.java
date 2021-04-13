/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-04-13
 * Time 16:50
 */
public class BinarySearch {
    //二分查找，如果找到就返回下标，没有找到就返回-1
    public static int binarySearch(int[] array,int target){
        int left =0;
        int right = array.length-1;

        int mid =0;
        while (left <= right){
             mid = left+(right - left)/2;

            if (target == array[mid]){
                return mid;
            }else if (array [mid] < target){
                left = mid+1;
            }else if(array[mid] > target){
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,4,5,6,7};
        System.out.println(binarySearch(array, 7));
    }
}
