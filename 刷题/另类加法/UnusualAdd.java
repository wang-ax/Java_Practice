package day15;

import java.util.Scanner;

/**
 * ClassName day15
 * Description TODO
 * Author 30712
 * Date 2020-12-11
 * Time 13:45
 */
public class UnusualAdd {
    public  static  int addAB(int A, int B) {
        // write code here
        //先进行异或,再加上要进位的
        if (B!=0){
            int  C= A ^ B;
            B = (A & B)<< 1;
            A = C;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(addAB(A, B));
    }
}
