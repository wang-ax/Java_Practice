package day13;

import java.util.Scanner;

/**
 * ClassName day13
 * Description TODO  输出有给定字符C画出的正方形
 * 使用循环输出
 * Author 30712
 * Date 2020-12-08
 * Time 14:03
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c = scanner.next().charAt(0);
        int line = 0;
        //如果是偶数，行数为n/2
        //如果是奇数，行数为n/2+1（由于是四舍五入进行取值）
        if(n %2 == 0){
            line = n/2;
        }else{
            line = n/2+1;
        }
        int j =0;
        for (int i = 0; i < line; i++) {
            //第一行和最后一行
            if (i == 0 || i == line - 1) {
                //全部打印字符c
                for (j = 0; j < n; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }else{
                //剩余的行
                for( j =0;j<n;j++){
                    //第一个位置和最后一个位置打印该字符
                    if(j ==0 || j == n-1) {
                        System.out.print(c);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
