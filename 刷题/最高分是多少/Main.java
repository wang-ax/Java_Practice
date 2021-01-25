package day24.最高分是多少;

/**
 * ClassName day24.最高分是多少
 * Description TODO
 * Author 30712
 * Date 2021-01-25
 * Time 16:05
 */

import java.util.Scanner;

/**
 * 5 7    学生的数目和操作的数目
 * 1 2 3 4 5    5个学生的初始成绩
 * 7行数据：如果是Q，表示询问成绩，成绩最高的
 * Q 1 5   //id从1-5的学生，最高的成绩是5，输出5
 * U 3 6   //1，2，6，4，5
 * Q 3 4   //输出6
 * Q 4 5   //输出5
 * U 4 5   //1，2，6，5，5
 * U 2 9   //1，9，6，5，5
 * Q 1 5    //输出9
 *
 * 输出：每一次询问操作，在一行里面输出最高成绩
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] score = new int[n];
            for(int i=0; i< n ; i++){
                score[i] = scanner.nextInt();
            }
            for (int i =0;i< m;i++){

                String str = scanner.next();
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                int max = score[0];

                if (str.equals("Q")){//询问操作
                    //遍历score中的成绩，找到最大的
                    for (int j =a-1;j<b;j++){
                        if (max < score[j]){
                            max = score[j];
                        }
                    }
                    System.out.println(max);

                }else if (str.equals("U")){//更新操作
                    score[a-1] = b;
                }
            }
        }
    }
}
