import java.util.HashMap;
import java.util.Map;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-25
 * Time 12:42
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        //使用size()和isEmpty()
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        //使用指定的key查找对应的value
        System.out.println(map.get("作者"));
        //查找对应的value，如果没有找到就是用默认值
        System.out.println(map.getOrDefault("作者","佚名"));

        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        //使用put插入键值对
        map.put("作者","鲁迅");
        map.put("标题","狂人日记");
        //相同的key，新的value值会覆盖旧的value值
        map.put("发表时间","1918年");
        map.put("发表时间","1919年");
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));

        //containsKey，containsValue判断是否存在
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));

        //遍历，每一个entry就是map中的一个键值对
        for (Map.Entry<String ,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
