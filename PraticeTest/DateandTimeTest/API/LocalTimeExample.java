package API;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * ClassName API
 * Description TODO
 * Author 30712
 * Date 2020-12-19
 * Time 19:56
 */
public class LocalTimeExample {
    /**
     * LocalTime类是一个不可变的类，
     * 默认格式时hh:mm:ss:.zzz
     * 提供了时区支持，同时可以传入小时、分钟、秒等输入参数来创建实例
     * @param args
     */
    public static void main(String[] args) {
        //Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);


        LocalTime specificTime = LocalTime.of(12,20,25,40);
        System.out.println("Specific Time of Day="+specificTime);

        //Try creating time by providing invalid inputs
        //LocalTime invalidTime = LocalTime.of(25,20);
        //Exception in thread "main" java.time.DateTimeException:
        //Invalid value for HourOfDay (valid values 0 - 23): 25
        //一天只有24个小时，没有25


        LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST="+timeKolkata);

        //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
       // LocalTime todayIST = LocalTime.now(ZoneId.of("IST"));

        //Getting date from the base date i.e 01/01/1970
        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time= "+specificSecondTime);
    }
}
