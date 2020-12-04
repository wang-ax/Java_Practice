package day8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName day8
 * Description TODO n个数里最小的K个数
 * Author 30712
 * Date 2020-12-02
 * Time 11:32
 */
public class MinK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split(" ");
        int[] num = new  int[s.length-1];
        for(int i = 0;i< s.length-1;i++){
            num[i] = Integer.parseInt(s[i]);
        }
        int k = Integer.parseInt(s[s.length-1]);//要找到前k个最小的数
        /**
         * 排序+ 分区
         * 找到下标为k的位置，就可以知道前k个都在左边，排序输出就可以了
         */
        int start = 0;
        int end = num.length-1;
        int index = quickSort(num,start,end);
        while (index != k){
            if(index >k){
                end = index -1;
                index = quickSort(num,start,end);
            }else {
                start = index +1;
                index = quickSort(num,start,end);
            }
        }
        //
        //所以排序就只需要排前K个就可以
        Arrays.sort(num,0,k);
        //遍历输出
        for(int i =0 ;i<k;i++){
            System.out.print(i == k-1 ? num[i]:num[i]+" ");
        }
        /**
         * 先排序然后再从排好的数组中取出前k个即为前K个最小的
         */
        /*Arrays.sort(num);//排序
        //取出前k个
        for(int i = 0;i<k;i++) {
            if(i == k-1){
                System.out.print(num[i]);
            }else{
                System.out.print(num[i]+" ");
            }
        }*/
    }
    //就是做partition的过程,使用的是快速排序的思想
    private static int quickSort(int[] num, int start, int end) {
        int key = num[start];
        while (start < end){
            while (start < end && num[end] >=key){
                end--;
            }
            num[start] = num[end];
            while (start < end && num[start] <= key){
                start++;
            }
            num[end] = num[start];
        }
        num[start] = key;
        return start;
    }
}
