package 数字在升序数组中出现的次数;

/**
 * ClassName 数字在升序数组中出现的次数
 * Description TODO
 * Author 30712
 * Date 2021-01-11
 * Time 19:18
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int count =0;
        for (int i =0;i< array.length;i++){
            if (array[i] == k){
                count++;
            }
        }
        return count;
    }
}
