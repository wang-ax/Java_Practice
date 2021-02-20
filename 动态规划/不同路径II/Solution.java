package 不同路径II;

/**
 * ClassName 不同路径II
 * Description TODO
 * Author 30712
 * Date 2021-02-20
 * Time 18:22
 */
public class Solution {
    //
    public int uniquePathsWithObstacles (int[][] obstacleGrid) {
        // write code here
        if (obstacleGrid == null){
            return 0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] pathNum= new int[row][col];

        for (int i=0;i< row;i++){
            if (obstacleGrid[i][0] == 0){
                pathNum[i][0] =1;
            }else {
                break;
            }
        }
        for (int j =0;j<col;j++){
            if (obstacleGrid[0][j] == 0){
                pathNum[0][j] = 1;
            }else {
                break;
            }
        }
        for (int i=1;i< row;i++){
            for (int j = 1;j< col;j++){
                //分两种情况来判断
                if (obstacleGrid[i][j] == 0){
                    pathNum[i][j] = pathNum[i-1][j]+pathNum[i][j-1];
                }
            }
        }
        return pathNum[row-1][col-1];
    }
}
