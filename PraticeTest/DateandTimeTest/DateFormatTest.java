import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-19
 * Time 17:50
 */
public class DateFormatTest {
    /**
     * 格式化日期，使用format方法可以将日期格式化
     * Java.text.DataFormat类中的format方法
     * @param args
     */
    public static void main(String[] args) {
        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyy/MM/dd");//年月日
        Date date1 = new Date();
        System.out.println(oldFormatter.format(date1));

        //Java 8
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyy/MM/dd");
        LocalDate date2 = LocalDate.now();
        System.out.println(newFormatter.format(date2));
    }
}
