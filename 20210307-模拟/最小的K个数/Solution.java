package 最小的K个数;

import java.util.ArrayList;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-06
 * Time 20:29
 */

/**
 * 基于Partition函数的解法
 */
public class Solution {
    public  static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        //时间复杂度：O(n)
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null  || input.length ==0 || input.length < k){
            return list;
        }
        int n = input.length;
        int start =0;
        int end = input.length;
        int index = Partition(input,n,start,end);
        while (index != k-1){
            if (index > k-1){
                end = index-1;
                index = Partition(input,n,start,end);
            }else {
                start  =index+1;
                index = Partition(input,n,start,end);
            }
        }

        for (int i=0;i < k;i++){
            list.add(input[i]);
        }
        return list;
    }

    private static int Partition(int[] input, int n, int start, int end) {
        //挖坑法
        int leftIndex= start;
        int rightIndex = end-1;
        int key = input[leftIndex];
        while (leftIndex < rightIndex){
            while (leftIndex < rightIndex && input[rightIndex] >= key){
                rightIndex--;
            }
            input[leftIndex] = input[rightIndex];
            while (leftIndex < rightIndex && input[leftIndex] <= key){
                leftIndex++;
            }
            input[rightIndex] = input[leftIndex];
        }
        input[leftIndex] = key;
        return leftIndex;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,5,6};
        System.out.println(GetLeastNumbers_Solution(array,4));
    }
}
