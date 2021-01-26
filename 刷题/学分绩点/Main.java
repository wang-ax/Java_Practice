package day25.学分绩点;

/**
 * ClassName day25.学分绩点
 * Description TODO
 * Author 30712
 * Date 2021-01-26
 * Time 15:43
 */

import java.util.Scanner;

/**
 * 5//总的课程数
 * 4 3 4 2 3//每门课的学分
 * 91 88 72 69 56 //对应课程的实际得分
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();//课程总数
        int[] credit = new int[n];//课程对应的学分
        int[] score = new int[n];//课程对应的成绩
        double all =0.0;
        double sumGPA ;
        double[] GPA = new double[n];//每门课程对应的几点
        int sum =0;//学分总和
        for (int  i =0;i< n;i++){
            credit[i] = scanner.nextInt();
            sum +=credit[i];
        }

        for (int i =0;i< n ;i++){
            score[i] = scanner.nextInt();
        }
        for (int i =0;i<n;i++){
            if (score[i] >=90 && score[i] <=100){
                GPA[i] = 4.0;
            }else if (score[i] >=85 && score[i] <=89){
                GPA[i] = 3.7;
            }else if (score[i] >=82 && score[i] <=84){
                GPA[i] = 3.3;
            }else if (score[i] >=78 && score[i] <=81){
                GPA[i] = 3.0;
            }else if (score[i] >=75 && score[i] <=77){
                GPA[i] = 2.7;
            }else if (score[i] >=72 && score[i] <=74){
                GPA[i] = 2.3;
            }else if (score[i] >=68 && score[i] <=71){
                GPA[i] = 2.0;
            }else if (score[i] >=64 && score[i] <=67){
                GPA[i] = 1.5;
            }else if (score[i] >=60 && score[i] <=63){
                GPA[i] = 1.0;
            }else if(score[i] < 60){
                GPA[i] = 0;
            }

            all += (GPA[i]*credit[i]);
        }
        System.out.printf("%.2f",all/sum);
        //System.out.println(sum);
    }
}
