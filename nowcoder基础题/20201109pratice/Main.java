
import java.util.Scanner;
/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-09
 * Time 23:32
 */
public class Main {
        public  static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()) {
                int n = scanner.nextInt();
                switch(n) {
                    case 200:
                        System.out.println("OK");
                        break;
                    case 202:
                        System.out.println("Accepted");
                        break;
                    case 400:
                        System.out.println("Bad Request");
                        break;
                    case 403:
                        System.out.println("Forbidden");
                        break;
                    case 404:
                        System.out.println("Not Found");
                        break;
                    case 500:
                        System.out.println("Internal Server Error");
                        break;
                    case 502:
                        System.out.println("Bad Gateway");
                        break;
                }
            }
        }
    }
