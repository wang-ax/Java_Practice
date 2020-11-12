import java.time.Year;
import java.util.Scanner;

/**
 * ClassName Main1
 * Description TODO
 * Author 30712
 * Date 2020-11-12
 * Time 14:41
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] str = scanner.nextLine().split(" ");
            int year = Integer.parseInt(str[0]);//年
            int month = Integer.parseInt(str[1]);//月
            int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
            //如果是闰年的话，2月的天数要改变
            if(year % 400 == 0 || year %4 == 0 && year %100 != 0) {
                days[1] = 29;
            }
            System.out.println(days[month-1]);//2月的天数就是days[1]
        }
    }
}
