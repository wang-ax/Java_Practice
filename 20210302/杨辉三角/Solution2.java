package 杨辉三角;

import java.util.Scanner;

/**
 * ClassName 杨辉三角
 * Description TODO
 * Author 30712
 * Date 2021-03-02
 * Time 22:30
 */
public class Solution2 {
    //使用数组

    /**
     * 非递归实现
     */
    private  static  int[][]  generate(int n){
        int[][] array = new int[n][n];
        for (int i =0;i< n;i++){
            for (int j =0;j<=i;j++){
                if (j == 0 || j == i){
                    array[i][j] = 1;
                }else {
                    array[i][j] = array[i-1][j-1]+array[i-1][j];
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] generate = generate(n);
        for (int i = 0;i< generate.length;i++){
            for (int j =0;j<=i;j++){
                System.out.print(generate[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
