package 带权值的最小路径和;

/**
 * ClassName 带权值的最小路径和
 * Description TODO
 * Author 30712
 * Date 2021-02-20
 * Time 18:32
 */
public class Solution {
    public int minPathSum (int[][] grid) {
        /**
         * grid[i][j] 表示从(0,0)到（i，j）的最小路径之和
         */
        // write code here
        if (grid.length == 0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        for (int i=1;i < row;i++){
            grid[i][0] =grid[i-1][0]+grid[i][0];
        }
        for (int j =1;j< col;j++){
            grid[0][j] =grid[0][j-1]+grid[0][j];
        }
        for (int i =1;i<row;i++){
            for (int j =1;j < col;j++){
                grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return grid[row-1][col-1];
    }
}
