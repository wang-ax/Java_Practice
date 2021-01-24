package day23.数字分类;

import java.util.Scanner;

/**
 * ClassName day23.数字分类
 * Description TODO
 * Author 30712
 * Date 2021-01-24
 * Time 18:18
 */

/**
 * 链接：https://www.nowcoder.com/questionTerminal/473c219f9e4d4ab2851ed388895a9c86
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int A1=0;
        int A2 =0;
        int A3 = 0;
        int A5 = 0;
        double A4 =0.0;
        double sum =0;
        int count =0;
        boolean flag =true;
        int count1 =0;
        int count2=0;
        int count5 =0;
        int max =0;
        for(int i =0;i<n;i++){
            //等待分类的整数
            nums[i] = scanner.nextInt();

            if (nums[i] % 5 == 0 && nums[i] % 2 == 0){
                A1 += nums[i];
                count1++;
            }
            //A2,将被5除后余1的数字按给出的顺序进行交错求和

            if (nums[i] % 5 == 1){
                count2++;
                if (flag){
                    A2 +=nums[i];
                    flag = false;
                }else {
                    A2 -=nums[i];
                    flag = true;
                }
            }
            
            if (nums[i] % 5 == 2){
                A3++;
            }

            if (nums[i] % 5 == 3){
                sum += nums[i];
                count++;
            }



            if (nums[i] % 5 == 4){
                if (nums[i] > max){
                    max = nums[i];
                }

                count5++;
            }
        }
        A4= (sum/count);
        A5 = max;
        if (count1 == 0){
            System.out.print("N"+" ");
        }else {
            System.out.print(A1+" ");
        }
        if (count2 == 0){
            System.out.print("N"+" ");
        }else {
            System.out.print(A2+" ");
        }
        if (A3 == 0){
            System.out.print("N"+" ");
        }else {
            System.out.print(A3+" ");
        }
        if (count == 0){
            System.out.print("N");
        }else {
            System.out.printf("%3.1f",A4);
        }
        if (count5 == 0){
            System.out.print(" "+"N");
        }else {
            System.out.print(" "+A5);
        }
    }
}

