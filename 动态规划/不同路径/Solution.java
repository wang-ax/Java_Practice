package 不同路径;

/**
 * ClassName 不同路径
 * Description TODO
 * Author 30712
 * Date 2021-02-20
 * Time 17:50
 */
 public class Solution {
    public int uniquePaths(int m, int n) {
        /**
         * 问题：从（0，0）到达(m-1,n-1)的路径个数
         * 状态：F(i,j)表示从（0，0）到达（i，j）的路径个数
         */
        int[][] pathNum = new int[m][n];
        //F(i,0) = F(0,j) =1;
        //第0行和第0列都是1
        for (int i =0;i< m;i++){
            pathNum[i][0] =1;
        }
        for (int i=0;i<n ;i++){
            pathNum[0][i] = 1;
        }
        for (int i= 1;i < m;i++){
            for (int j =1;j< n;j++){
                //状态转移方程
                pathNum[i][j] = pathNum[i-1][j]+pathNum[i][j-1];
            }
        }
        return pathNum[m-1][n-1];
    }
}
