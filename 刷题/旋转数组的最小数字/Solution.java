package 旋转数组的最小数字;

import java.util.Scanner;

/**
 * ClassName 旋转数组的最小数字
 * Description TODO
 * Author 30712
 * Date 2020-12-29
 * Time 13:59
 */
public class Solution {
    public  static int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;//数组大小为0，返回0
        }
        //找到数组中最小的数
        int min = array[0];
        for (int i =0;i< array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        int[] array = new int[strings.length];
        for (int i=0;i<strings.length;i++ ){
            array[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(minNumberInRotateArray(array));
    }
}
