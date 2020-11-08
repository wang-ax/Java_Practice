import java.util.Scanner;

/**
 * ClassName Main5
 * Description TODO
 * Author 30712
 * Date 2020-11-08
 * Time 20:16
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int score1 = Integer.parseInt(str[0]);
        int score2 = Integer.parseInt(str[1]);
        int score3 = Integer.parseInt(str[2]);
        int score4 = Integer.parseInt(str[3]);
        double score = (score1*0.2) + (score2*0.1) +(score3*0.2)+(score4*0.5);
        System.out.println(score);
    }
}
