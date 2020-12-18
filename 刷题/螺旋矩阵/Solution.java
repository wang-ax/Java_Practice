package 螺旋矩阵;

import java.util.ArrayList;

/**
 * ClassName 螺旋矩阵
 * Description TODO
 * Author 30712
 * Date 2020-12-18
 * Time 20:52
 */
public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();//最种要得到一个list
        if(matrix == null || matrix.length == 0){
            return list;
        }
        int xs = 0;
        int xe = matrix.length-1;
        int ys =0;
        int ye= matrix[0].length-1;

        while (xs <= xe && ys <= ye){
            for (int j = ys;j<=ye;j++){
                list.add(matrix[xs][j]);//先打印出第一行
            }
            xs++;//行的值++
            for (int i =xs;i <=xe;i++){
                list.add(matrix[i][ye]);//打印最后一列
            }
            ye--;//列的值--

            if (xs <= xe){
                for (int j = ye;j >= ys;j--){
                    list.add(matrix[xe][j]);
                }
            }
            xe--;
            if (ys <= ye){
                for (int i = xe;i >= xs;i--){
                    list.add(matrix[i][ys]);
                }
            }
            ys++;
        }
        return list;
    }
}
