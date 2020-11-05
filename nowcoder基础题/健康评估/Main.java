package 健康评估;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-05
 * Time 17:35
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        scanner.close();
//输入体重和身高
        double weight = Double.parseDouble(str[0]);//将字符串类型转换成double类型
        double height = Double.parseDouble(str[1]);
        //计算BMI
        double  bmi = weight /(height*height);

        if(bmi >= 18.5 && bmi <= 23.9) {
            System.out.println("Normal");
        }else{
            System.out.println("Abnormal");
        }
    }
}
