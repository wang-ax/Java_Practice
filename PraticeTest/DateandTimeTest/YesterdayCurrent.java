import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-19
 * Time 19:17
 */
public class YesterdayCurrent {
    /**
     * 打印昨天的当前时刻
     * import java.util.Calendar;
     * @param args
     */
    public static void main1(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        System.out.println(calendar.getTime());
    }

    //java-8
    //import java.time.LocalDateTime
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();//现在的时间
        LocalDateTime yesterday  = today.minusDays(1);
        System.out.println(yesterday);
    }
}
