package 调整数组顺序使奇数位于偶数前面;

/**
 * ClassName 调整数组顺序使奇数位于偶数前面
 * Description TODO
 * Author 30712
 * Date 2021-02-28
 * Time 17:59
 */
public class Solution2 {
    public  static int[] reOrderArray (int[] array) {
        int length =array.length;
        if (array == null || length == 0) {
            return null;
        }
        int i = 0;
        int j = array.length-1;

        while (i < j){
            while (i < j && !isEven(array[i])){
                i++;
            }
            while (i < j && isEven(array[j])){
                j--;
            }
            if (i < j){
                int temp =array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }
    //确定分组的标准
    private static boolean isEven(int n) {
       // return (n & 1) == 0;
        return n >0;
    }

    public static void main(String[] args) {
        int[] array = {1,-2,3,-4,5,-6,7};
        int[] reOrderArray = reOrderArray(array);
        for (int i : reOrderArray){
            System.out.println(i);
        }
    }
}
