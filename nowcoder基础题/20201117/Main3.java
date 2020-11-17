package pratice;

import java.util.Scanner;

/**
 * ClassName Main3
 * Description TODO
 * Author 30712
 * Date 2020-11-17
 * Time 13:50
 */
public class Main3 {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);

        int[][] arr= new int[m][n];
        String[][] strings = new String[m][n];

        int max =0;
        int h =0;
        int  s =0;
        for(int i =0;i<m;i++) {
            strings[i] = scanner.nextLine().split(" ");
            for( int j =0;j<n;j++) {
                arr[i][j] = Integer.parseInt(strings[i][j]);
                if(arr[i][j] > max){
                    max = arr[i][j];
                    h = i;
                    s = j;
                }
            }
        }
        System.out.println((h+1) +" " +(s+1));


    }
}
