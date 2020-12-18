package 寻找峰值;

import java.util.Scanner;

/**
 * ClassName 寻找峰值
 * Description TODO
 * Author 30712
 * Date 2020-12-18
 * Time 20:01
 */
public class Solution {
    public  static int solve (int[] a) {
        // write code here
        //考虑特殊情况
        if ( a == null || (a.length == 0)){
            return -1;
        }
        if (a.length ==1){
            return 0;
        }
        //处理特殊的条件
        if(a[a.length -1]>= a[a.length-2]){
            return a.length-1;
        }
        int n =0;//峰值数
        int maxIndex = 0;//max的下标
        for(int i =1;i<a.length-1;i++){
            if(a[i] >=a[i-1] && a[i] >=a[i+1]){
                n =a[i];
                maxIndex =i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(",");
        int[] array = new int[strings.length];
        for (int i = 0;i<strings.length;i++){
            array[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(solve(array));
    }
}
