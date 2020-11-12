import java.util.Scanner;

/**
 * ClassName Main4
 * Description TODO
 * Author 30712
 * Date 2020-11-12
 * Time 15:08
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            for(int i =0;i<n;i++) {
                for (int j =0;j< n;j++) {
                    if(j >=(n-1-i)){
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
