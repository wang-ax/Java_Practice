package 数组中值只出现了一次的数字;

import java.util.Scanner;

/**
 * ClassName 数组中值只出现了一次的数字
 * Description TODO
 * Author 30712
 * Date 2021-01-31
 * Time 15:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i =0;i< n;i++){
                arr[i] = scanner.nextInt();
            }
            int[] arr1 = new int[n/2];
            int[] arr2 = new int[n/2];
            //输出出现奇数次的两个数
            //使用异或的方式
            FindNumsAppearOnce(arr,n,arr1,arr2);

            if (arr1[0] < arr2[0]){
                System.out.println(arr1[0]);
                System.out.println(arr2[0]);
            }else {
                System.out.println(arr2[0]);
                System.out.println(arr1[0]);
            }

        }
    }
    //从前到后异或数组中的每个数字，最终得到的结果就是两个只出现了一次的的数字的异或结果
    public  static void  FindNumsAppearOnce(int[] arr,int length,int[] arr1,int[] arr2){
        //对数组中的每个数字进行异或处理
        int result =0;//异或的结果
        for (int  i =0;i< length;i++){
            result ^= arr[i];
        }
        //result表示两个出现过奇数次的数字进行异或的结果
        arr1[0] =0;
        arr2[0] =0;
        int index = result -(result & (result-1));
        for (int i =0;i<length;i++){
            if((index & arr[i]) == index){
                arr1[0] ^= arr[i];
            }else {
                arr2[0] ^=arr[i];
            }
        }
    }


    /*private static int FindFirst1(int result) {

        int index =0;
        while ((result & 1) == 0 && index< 8){
            result = result >>1;
            ++index;
        }
        return index;
    }*/
}
