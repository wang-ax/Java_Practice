package 背包问题;

import java.util.Scanner;

/**
 * ClassName 背包问题
 * Description TODO
 * Author 30712
 * Date 2021-02-22
 * Time 12:25
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n= sc.nextInt();//n件物品
        int  m= sc.nextInt();//包的总容量为m
        int[] V = new int[n];//商品各自的价值
        int[] A = new int[n];//商品的大小
        for (int i=0;i<n;i++){
            V[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }

       backPack(m, A, V);
    }

    private static void backPack(int m, int[] A, int[] V) {
        int n = A.length;
        if (n == 0 || m == 0) {
            return ;
        }

        //F(i,0) = F(0,j) = 0
        int[][] maxV = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (A[i - 1] <= j) {
                    maxV[i][j] = Math.max(maxV[i - 1][j], maxV[i - 1][j - A[i - 1]] + V[i - 1]);
                } else {
                    maxV[i][j] = maxV[i - 1][j];
                }

            }
        }
        System.out.println(maxV[n][m]);
    }
}
