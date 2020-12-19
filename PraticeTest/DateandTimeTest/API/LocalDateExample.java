package API;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-19
 * Time 19:25
 */
public class LocalDateExample {
    /**
     * 默认格式是yyyy-MM-dd 的日期
     * 我们可以传入 ZoneId 来获得指定时区的日期
     * @param args
     */
    public static void main(String[] args) {
        //当前日期
        LocalDate today = LocalDate.now();
        System.out.println("Current Date = "+today);
        //得到指定年份和指定月份的第一天
        LocalDate firstDay_2019 = LocalDate.of(2019, Month.JANUARY,1);
        System.out.println("Specific Date = "+firstDay_2019);

        //LocalDate feb29_2014 = LocalDate.of(2014,Month.FEBRUARY,29);
        //System.out.println(feb29_2014);
        //2014年不是闰年，所以2014年的2月没有29号，程序出现异常（运行时异常）
        //Invalid date 'February 29' as '2014' is not a leap year

        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST :"+todayKolkata);

        //LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));

        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= "+dateFromBase);

        //2014年的第100天
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014,100);
        System.out.println(hundredDay2014);
    }
}
