package 奇偶统计;
import java.util.Scanner;
/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-05
 * Time 22:42
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count1 =0;//偶数个数
        int count2 =0;//奇数个数
        for(int i =1 ;i<= n ;i++) {
            if(i % 2 == 0) {
                count1++;
            }else{
                count2++;
            }
        }
        System.out.print(count2 + " " + count1);
    }
}
