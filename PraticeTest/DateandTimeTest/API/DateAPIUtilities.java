package DateandTimeLearning.API;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * ClassName DateandTimeLearning.API
 * Description TODO  日期的API工具：加减天数、周、月
 * 还有其他的工具方法能够使用 TemporalAdjuster 调整日期，并计算两个日期间的周期。
 * Author 30712
 * Date 2020-12-26
 * Time 17:26
 */
public class DateAPIUtilities {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Year:"+today.getYear());
        //判断是不是闰年
        System.out.println("is Leap Year :" + today.isLeapYear());
        //Compare two LocalDate for before and after
        System.out.println("Today is before 01/01/2015? "+today.isBefore(LocalDate.of(2015,1,1)));

        System.out.println("Current Time ："+ today.atTime(LocalTime.now()));

        //10天之后是哪一天
        System.out.println("10 days after today will be"+today.plusDays(10));
        //3周之后
        System.out.println(" 3 weeks after today will be :"+today.plusWeeks(3));
        System.out.println(" 10 months after today will be :" + today.plusMonths(10));

        System.out.println("10 days before today will be"+today.minusDays(10));
        System.out.println(" 3 weeks before today will be :"+today.minusWeeks(3));
        System.out.println(" 10 months before today will be :" + today.minusMonths(10));

        System.out.println("First date of this month= "+today.
                with(TemporalAdjusters.firstDayOfMonth()));//该月的第一天
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last date of this year= "+lastDayOfYear);//该月的最后一天
        Period period = today.until(lastDayOfYear);
        System.out.println("Period Format= "+period);
        System.out.println("Months remaining in the year= "+period.getMonths());

    }
}
