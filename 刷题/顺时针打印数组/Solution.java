package 顺时针打印数组;

/**
 * ClassName 顺时针打印数组
 * Description TODO
 * Author 30712
 * Date 2021-01-22
 * Time 15:14
 */
import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int a =0;
        int b =0;
        int c = matrix.length-1;
        int d = matrix[0].length-1;
        while (a <= c && b <= d){
            list.addAll(printEdge(matrix,a++,b++,c--,d--));
        }
        return list;
    }

    private  static ArrayList<Integer> printEdge(int[][] matrix, int a, int b, int c, int d) {
        ArrayList<Integer> list = new ArrayList<>();
        if ( a== c){
            //只有1行，从左到右依次打印
            for (int i = b;i <= d;i++){
                list.add(matrix[a][i]);
                //System.out.println(matrix[a][i]+" ");
            }
        }else if (b == d){
            //只有1列，从上到下依次打印
            for (int i =a ;i<= c;i++){
                list.add(matrix[i][b]);
                //System.out.println(matrix[i][b]+" ");
            }
        }else {
            int curC = b;
            int curR = a;
            while (curC < d) {
                // 从左到右打印
                list.add(matrix[a][curC]);
                //System.out.print(matrix[a][curC] + " ");
                curC++;
            }
            while (curR < c) {
                // 从上到下打印
                list.add(matrix[curR][d]);
                //System.out.print(matrix[curR][d] + " ");
                curR++;
            }
            while (curC > b) {
                // 从右到左打印
                list.add(matrix[c][curC]);
               // System.out.print(matrix[c][curC] + " ");
                curC--;
            }
            while (curR > a) {
                // 从下到上打印
                list.add(matrix[curR][b]);
               // System.out.print(matrix[curR][b] + " ");
                curR--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        ArrayList<Integer> list = printMatrix(matrix);
        for (Integer i : list){
            System.out.print(i + " ");
        }
    }
}
