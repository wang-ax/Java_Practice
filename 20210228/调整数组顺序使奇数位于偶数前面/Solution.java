package 调整数组顺序使奇数位于偶数前面;

/**
 * ClassName 调整数组顺序使奇数位于偶数前面
 * Description TODO
 * Author 30712
 * Date 2021-02-28
 * Time 14:51
 */
public class Solution {
    public  static int[] reOrderArray (int[] array) {
        //奇数在前，偶数在后
        /**
         * 使用左右指针，不能保证保持原来的顺序
         */
      /*  int i =0;
        int j = array.length-1;
        while (i < j){
            while (i < j&& array[i] %2 != 0 ){
                i++;
            }
            while (i < j&& array[j] %2 == 0 ){
                j--;
            }
            if (i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        return array;*/
        /**
         *借鉴冒泡排序，将相邻的偶数和奇数交换
         */
        for (int i=1;i< array.length;i++){
            for (int j =i-1;j>=0;j--){
                if ( array[j] %2 == 0 && array[j+1] %2 ==1 ){
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] results = reOrderArray(array);
        for (int i :results){
            System.out.print(i+" ");
        }
    }
}
