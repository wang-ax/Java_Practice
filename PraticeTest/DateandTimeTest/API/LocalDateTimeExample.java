package DateandTimeLearning.API;

import java.time.*;

/**
 * ClassName DateandTimeLearning.API
 * Description TODO
 * Author 30712
 * Date 2020-12-21
 * Time 18:53
 */
public class LocalDateTimeExample {
    /**
     * Java.time.DateTimeException 运行时异常，不需要显示地捕获
     * @param args
     */
    public static void main(String[] args) {
        //Current Date 获取当前的时间
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current DateTime:"+today);

        //用LocalDate 和LocalTime来获取当前时间
        //LocalDate是获取日期，LocalTime是获取时间
        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current DateTime :"+ today);

        //获得一个指定的时间
         LocalDateTime specificDate = LocalDateTime.of(2019, Month.JANUARY, 1, 10, 10, 30);
        System.out.println("Specific Date :"+specificDate);


        //Try creating date by providing invalid inputs
        //LocalDateTime feb29_2014 = LocalDateTime.of(2014, Month.FEBRUARY, 28, 25,1,1);


        //通过传入ZonId得到日期/时间数据
        LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));//印度的时间
        System.out.println("Current Date in IST="+todayKolkata);

        //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        //LocalDateTime todayIST = LocalDateTime.now(ZoneId.of("IST"));



        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("10000th second time from 01/01/1970= "+dateFromBase);
    }
}
