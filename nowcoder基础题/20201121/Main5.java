import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-11-21
 * Time 19:39
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//要输出的行数
        int[][] arr = new int[n][n];
        for(int i =0;i<n;i++) {
            for(int j =0;j<=i;j++) {
                if(j == 0 || j == i) {
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j-1] +arr[i-1][j];
                }
            }
        }
        //打印二维数组
        for(int i =0;i<n;i++) {
            for(int j = 0;j<=i;j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
