package xxx定律;

import java.util.Scanner;

/**
 * ClassName xxx定律
 * Description TODO
 * Author 30712
 * Date 2021-02-05
 * Time 23:44
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (n ==0){
                return;
            }
            int count =0;
            while (n != 1){
                if (n % 2 == 0){
                    n = n/2;
                }else {
                    n = (3*n +1)/2;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
