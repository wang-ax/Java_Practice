package test3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ClassName test2
 * Description TODO
 * Author 30712
 * Date 2021-08-08
 * Time 14:24
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] nums = s.toCharArray();


/*        if (nums.length == 1){
            System.out.println(1);
        }else{
            //删除一个数字之后，里面的每个数字出现的次数相同
            //找出最长的前缀
            //数组中只有一个数字出现一次，其他数字出现的次数都是相同的，
            HashMap<Character ,Integer> map = new HashMap<>();
            for (int i=0;i< nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }*/
        int max =0;
        int result =0;
        int i =0;
        for (int j =1;j< nums.length;j++){
            if(fun(nums,i,j)){
                 result = j-i+1;
                if (result > max){
                    max = result;
                }
            }
        }
        System.out.println(max);
    }

    private static boolean fun(char[] nums, int i, int j) {
        //从i到j，只有一个元素出现一次，其他元素出现的次数相同
        HashMap<Character ,Integer> map = new HashMap<>();
        for (int start=i;start <= j;start++){
            map.put(nums[start],map.getOrDefault(nums[start],0)+1);
        }
        //每个数字出现的次数都是相同的
       for (Character c : map.keySet()){
           map.get(c);
       }

        if (map.containsValue(1) ){
            return true;
        }
        return false;
    }
}
