package DateandTimeLearning.API;

/**
 * ClassName DateandTimeLearning.API
 * Description TODO
 * Author 30712
 * Date 2020-12-26
 * Time 12:00
 */

import java.time.Duration;
import java.time.Instant;

/**
 * Instant 类是用在机器可读的时间格式上，它以Unix时间戳的形式存储日期和时间
 */
public class InstantExample {
    public static void main(String[] args) {
        //现在的时间
        Instant timestamp = Instant.now();
        System.out.println("Current Timestamp :" + timestamp);

        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println(specificTime);

        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);


    }
}
