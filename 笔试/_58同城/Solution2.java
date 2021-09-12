package _58同城;

import java.util.Arrays;

/**
 * ClassName 同城
 * Description TODO 找出最后一个指定的数（找出最后一个只出现一次的数，如果没有返回-1）
 * Author 30712
 * Date 2021-09-11
 * Time 20:33
 */
public class Solution2 {
    public static int solution (int[] source) {
        // write code here
        if (source == null || source.length == 0){
            return -1;
        }
        if (source.length == 1){
            return source[0];
        }
        int count =1;
        Arrays.sort(source);
        for(int i =1;i<source.length;i++){
            count =1;
            if (source[i] == source[i-1]){
                count++;
                if (count > 1 && i-2 >= 0  && source[i] != source[i-2] && source[i] == source[i+1]){
                    return source[i-2];
                }else {
                    continue;
                }
            }
        }
        if (count == 1){
            return source[source.length-1];
        }
        return -1;

     /*   //
        int res = -1;
        if(source == null) return -1;
        if(source.length == 0) return -1;
        if(source.length == 1) return source[0];

        int left = 0;
        int right = 1;
        while (right < source.length){
            if(source[left] != source[right]){
                res = source[left];
            }
            while (right < source.length && source[left] == source[right]){
                right++;
            }
            left = right;
            right = right + 1;
        }
        if(left == source.length -1){
            res = source[left];
        }
        return res;*/
    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,4,4,5};
        System.out.println(solution(nums));
    }
}
