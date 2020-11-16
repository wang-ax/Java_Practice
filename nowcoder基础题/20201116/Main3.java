package pratice;

import java.util.Scanner;

/**
 * ClassName Main3
 * Description TODO
 * Author 30712
 * Date 2020-11-16
 * Time 23:32
 */
public class Main3 {
    //输出正数、负数的个数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int positivecount = 0;
        int negativecount = 0;
        for(int i =0;i<str.length;i++) {
            int x = Integer.parseInt(str[i]);
            if(x < 0) {
                negativecount++;
            }else{
                positivecount++;
            }
        }
        System.out.println("positive:"+positivecount);
        System.out.println("negative:"+negativecount);
    }
}
