package 数字中出现次数超过一半的数字;

import java.util.Arrays;

/**
 * ClassName 数字中出现次数超过一半的数字
 * Description TODO
 * Author 30712
 * Date 2020-12-29
 * Time 14:52
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        //直接对数组进行排序，如果存在这个数，那么最中间的数字就是要找的数
        Arrays.sort(array);
        int count =0;
        for (int i =0;i<array.length;i++){
            if(array[i] == array[array.length/2]){
                count++;
            }
        }
        if(count > array.length/2){
            return array[array.length/2];
        }else{
            return  0;
        }
    }
}
