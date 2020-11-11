import java.util.Scanner;

/**
 * ClassName Main4
 * Description TODO
 * Author 30712
 * Date 2020-11-11
 * Time 10:58
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score >= 0 && score <=100) {
            if(score >=90) {
                System.out.println("A");
            }else if(score >=80) {
                System.out.println("B");
            }else if(score >= 70){
                System.out.println("C");
            }else if(score >=60) {
                System.out.println("D");
            }else  {
                System.out.println("E");
            }
        } else{
            System.out.println("F");
        }
    }
}
