package 三角形最小路径之和;

import java.util.ArrayList;

/**
 * ClassName 三角形最小路径之和
 * Description TODO
 * Author 30712
 * Date 2021-02-18
 * Time 11:15
 */
public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0){
            return 0;
        }
        //res[i][j] 表示顶点(0,0)到达坐标(i,j)的最小路径长度
        int x = triangle.size();
        int y = triangle.get(x-1).size();
        int[][] res = new int[x][y];
        res[0][0] = triangle.get(0).get(0);
        for (int i=1;i<x;i++){
            //边界情况：j=0
            res[i][0] = res[i-1][0] + triangle.get(i).get(0);
            for (int j =1;j<i;j++){
                res[i][j] = Math.min(res[i-1][j-1],res[i-1][j]) +triangle.get(i).get(j);
            }
            //边界情况：i=j
            res[i][i] = res[i-1][i-1] + triangle.get(i).get(i);
        }
        int answer = res[x-1][0];
        for (int i=1;i< y;i++){
            //全局最小的路径和
            answer = Math.min(answer,res[x-1][i]);
        }
        return answer;
    }
}
