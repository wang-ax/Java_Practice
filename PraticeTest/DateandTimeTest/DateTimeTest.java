import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-19
 * Time 17:10
 */
public class DateTimeTest {

    /**
     * 获取年月日，小时、分钟、秒
     * @param args
     */
    public static void main1(String[] args) {
        Calendar calendar = Calendar.getInstance();
        /**
         * Calendar是一个抽象类，实现了Serializable，C龙able，Comparable接口
         */
        //得到目前的时间
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        //
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
    }

    /**
     * 取得从1970年1月1日0时0分0秒到现在时间的毫秒数
     * @param args
     */
    public static void main2(String[] args) {
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(System.currentTimeMillis());

        System.out.println(Clock.systemDefaultZone().millis());
    }

    /**
     * 获得某月的最后一天和第一天
     * @param args
     */
    public static void main3(String[] args) {
        //获取当前月的第一天
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH,0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号，当前日期为月第一天
        String first = String.format(String.valueOf(c.getTime()));
       System.out.println("=============first :"+first);

        //获取当前月的最后一天
       Calendar ca = Calendar.getInstance();
       ca.set(Calendar.DAY_OF_MONTH,ca.getActualMaximum(Calendar.DAY_OF_MONTH));
       String last = String.format(String.valueOf(ca.getTime()));
        System.out.println("=============last:"+last);

        //Java 8
        LocalDateTime today = LocalDateTime.now();//现在的时间
        System.out.println(today);
        //本月的第一天
        LocalDate firstday = LocalDate.of(today.getYear(),today.getMonth(),1);
        //本月的最后一天
        LocalDate lastday = LocalDate.from(today.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(firstday);
        System.out.println(lastday);
    }
}
