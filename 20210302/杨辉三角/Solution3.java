package 杨辉三角;

import java.util.Scanner;

/**
 * ClassName 杨辉三角
 * Description TODO
 * Author 30712
 * Date 2021-03-02
 * Time 22:44
 */

/**
 * 递归实现
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            for (int i=0;i < n;i++){
                for (int j =0;j <=i;j++){
                    System.out.print(generate(i,j)+" ");
                }
                System.out.println();
            }
        }
    }

    private static int generate(int i, int j) {
        if (j == 0 || i == j){
            return 1;
        }else {
            return generate(i-1,j-1)+generate(i-1,j);
        }
    }
}
