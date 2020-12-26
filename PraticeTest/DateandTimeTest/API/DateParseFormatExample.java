package DateandTimeLearning.API;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ClassName DateandTimeLearning.API
 * Description TODO 将一个日期格式转换为不同的格式，之后再解析一个字符串，得到日期时间对象
 * Author 30712
 * Date 2020-12-26
 * Time 17:50
 */
public class DateParseFormatExample {
    public static void main(String[] args) {
        //Format examples
        LocalDate date = LocalDate.now();
//default format
        System.out.println("Default format of LocalDate="+date);
//specific format
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
        LocalDateTime dateTime = LocalDateTime.now();
//default format
        System.out.println("Default format of LocalDateTime="+dateTime);
//specific format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        Instant timestamp = Instant.now();
//default format
        System.out.println("Default format of Instant="+timestamp);

    }
}
