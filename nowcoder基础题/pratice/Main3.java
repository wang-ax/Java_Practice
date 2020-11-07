package pratice;

import java.util.Scanner;

/**
 * ClassName Main3
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 15:22
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String str = scanner.nextLine();
        int countA = 0;
        int countB = 0;
        char[] ch = str.toCharArray();
        for(int i =0;i<ch.length-1;i++) {
            if(ch[i] == 'A' ){
                countA++;
            }else {
                countB++;
            }
        }
        if(countA == countB) {
            System.out.println("E");
        }else if(countA > countB) {
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}






