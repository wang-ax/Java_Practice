package 转圈打印矩阵;

/**
 * ClassName 转圈打印矩阵
 * Description TODO
 * Author 30712
 * Date 2020-12-18
 * Time 20:24
 */
public class Main {
    public  static  void  printMatrix (int[][] matrix) {
        // write code here
        //每次打印最外圈
        //写出打印一圈的算法
        int a =0;
        int b =0;
        int c = matrix.length-1;
        int d = matrix[0].length-1;
        while (a <= c && b <= d){
            printEdge(matrix,a++,b++,c--,d--);
        }
    }

    private  static  void printEdge(int[][] matrix, int a, int b, int c, int d) {
        if ( a== c){
            //只剩最后一行
            for (int i = b;i <= d;i++){
                System.out.println(matrix[a][i]+" ");
            }
        }else if (b == d){
            for (int i =a ;i<= c;i++){
                System.out.println(matrix[i][b]+" ");
            }
        }else {
            int curC = b;
            int curR = a;
            while (curC < d) {
                // 从左到右打印
                System.out.print(matrix[a][curC] + " ");
                curC++;
            }
            while (curR < c) {
                // 从上到下打印
                System.out.print(matrix[curR][d] + " ");
                curR++;
            }
            while (curC > b) {
                // 从右到左打印
                System.out.print(matrix[c][curC] + " ");
                curC--;
            }
            while (curR > a) {
                // 从下到上打印
                System.out.print(matrix[curR][b] + " ");
                curR--;
            }

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        printMatrix(matrix);
    }
}
