package 扑克牌顺子;

import java.util.Arrays;

/**
 * ClassName 扑克牌顺子
 * Description TODO
 * Author 30712
 * Date 2021-01-15
 * Time 11:09
 */
public class Solution {
    //把数组进行排序
    //统计数组中0的个数；0就是大小王，大小王可以用任意数字代替
    //统计排好之后的数组中相邻数字数字之间的空缺数字的总数，如果空缺的总数小于等于0的个数，则数组就是连续的
    public  static boolean isContinuous(int [] numbers) {
        if (numbers.length <1 || numbers == null){
            return false;
        }
        //对数组进行排序
        Arrays.sort(numbers);
       //统计数组中0的个数
        int count0 =0;
        for (int i =0;i< numbers.length ;i++){
            if (numbers[i] == 0){
                count0++;
            }
        }
        //统计数组中相邻数字之间的空缺总数
        int countGap = 0;
        int start =  count0;
        int end = start+1;
        while (end < numbers.length){
            if (numbers[start] == numbers[end]){
                return false;
            }else {
                countGap += numbers[end]- numbers[start]-1;
                start++;
                end++;
            }
        }
        //空缺的数字小于0的个数，就说明是顺子（可以使用任意数字进行代替）
        if (countGap <= count0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {0,3,2,6,4};
        System.out.println(isContinuous(array));
    }
}
