import java.util.Scanner;

/**
 * ClassName Main3
 * Description TODO
 * Author 30712
 * Date 2020-11-09
 * Time 23:45
 */
public class Main3 {
    public static void main(String[] args) {
        String admin = "admin";
        String password = "admin";
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");//字符串数组
        //字符串比较，使用equals
        if(str[0].equals(admin)&&str[1].equals(password)){
            //一致返回 Success!
            System.out.println("Login Success!");
        }else{
            //不一致返回Login Fail!
            System.out.println("Login Fail!");
        }
    }
}
