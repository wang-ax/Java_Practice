/*
package 深信服.求最大和子矩阵;

*/
/**
 * ClassName 深信服.求最大和子矩阵
 * Description TODO
 * Author 30712
 * Date 2021-09-14
 * Time 19:55
 *//*

public class Solution {
    public int[] max_sub_matrix (int[][] matrix) {
        // 找出子矩阵的最大和
        int[] result = new int[5];
        int n =matrix.length;
        int[][] dp = new int[n][n];
        dp[0][0] = 0;
        //得到所有的矩阵，计算矩阵的和，矩阵的和最大，输出该矩阵左上角和右下角的坐标
        for (int i =0;i<matrix.length;i++){
            for (int j =0;j<matrix[0].length;j++){
                //dp[i][j] 表示的是以ij为左上角的矩阵的和
                dp[i][j] = matrix[i][j] +
            }
        }

    }
}
*/
