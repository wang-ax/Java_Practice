package 网易;

import java.util.Scanner;

/**
 * ClassName 网易
 * Description TODO 数字迷宫
 * Author 30712
 * Date 2021-09-18
 * Time 19:46
 */

public class Main4 {
    /**
     * n*n的数字迷宫
     * # 代表存在障碍，花费a代价消除该障碍
     * 。可以任意移动，无序代价
     * * 代表传送门，可以使用它并花费b代缴传送到迷宫中另外一个为* 的位置，非强制性的，可以经过它但并不使用它
     * 牛牛可以上下左右进行移动
     * 需要的最小代价
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char[][]  chars = new char[n][n];
        for (int i =0;i<n;i++){
            chars[i] = scanner.nextLine().toCharArray();
            for (int j =0;j < n;j++){

            }
        }
        minCourse(chars,n,a,b);

    }
    public static int minCourse(char[][] chars,int n,int a,int b){

        int[][] dp = new int[n][n];//表示从1,1到i,j 所需要的最小代价



        return dp[n][n];
    }
}
