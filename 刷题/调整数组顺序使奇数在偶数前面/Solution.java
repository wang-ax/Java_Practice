package 调整数组顺序使奇数在偶数前面;

/**
 * ClassName 调整数组顺序使奇数在偶数前面
 * Description TODO
 * Author 30712
 * Date 2021-01-07
 * Time 21:33
 */
public class Solution {
    public void reOrderArray(int [] array) {
        //定义两个指针
        //所有的奇数都放在数组的前半部分，偶数位于数组的后半部分
        int left =0;
        int right = left;
        int len = array.length;

        while(right < len){//如果是奇数，left++，right = left+1
            while(left < len && array[left]%2 != 0){
                left++;
            }
            right = left+1;//
            while(right < len && array[right] %2 == 0){
                right++;
            }
            if(right < len){
                int temp = array[right];
                for(int i =right-1;i>=left;i--){
                    array[i+1] = array[i];
                }
                array[left] = temp;
            }

        }
    }
}
