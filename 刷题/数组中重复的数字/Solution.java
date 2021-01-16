package 数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName 数组中重复的数字
 * Description TODO
 * Author 30712
 * Date 2021-01-16
 * Time 11:47
 */
public class Solution {
    //数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。找出第一个重复的数字

    /**
     *
     * @param numbers  长度为n的数组
     * @param length  数组的长度
     * @param duplication 重复的数字放到duplication[0] 位置
     * @return
     */
    public  static boolean duplicate(int numbers[],int length,int [] duplication) {
        //2，3，1，0，2，5，3
        //0，1，2，2，3，3，5
        if (numbers == null || numbers.length ==0){
            return false;
        }
        //对数组进行排序
        //Arrays.sort(numbers);
        /**
         * [6,3,2,0,2,5,0] 应该输出的是true，2 但是通过这种排序的方法输出的结果是true，0
         */
        /*int n =0;
        for (int i =0;i<length-1;i++){
            if (numbers[i] == numbers[i+1]){
                duplication[i] = numbers[i];
                return true;
            }
        }
        return false;*/


        //有重复的字眼就想到使用Set，因为Set可以去重
        //按照原先数组的顺 序进行增加，
        //如果第一次碰到数字已经存在就说明该数字是第一个重复的数字，直接将该数字赋值给duplication[0]
        //并且直接return结束循环，后面的就不会再执行了
        Set<Integer> set = new HashSet<>();
        for (int i=0;i< length;i++){
            if (set.contains(numbers[i])){
                duplication[0] = numbers[i];
                return true;
            }else {
                set.add(numbers[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {6,3,2,0,2,5,0};
        int length = numbers.length;
        int[] duplication =new int[length];
        boolean duplicate = duplicate(numbers, length, duplication);
        System.out.println(duplicate);
        System.out.println(duplication[0]);
    }
}
