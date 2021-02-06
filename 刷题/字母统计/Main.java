package day36.字母统计;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName day36.字母统计
 * Description TODO
 * Author 30712
 * Date 2021-02-06
 * Time 10:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String  string  = scanner.nextLine();
            String string1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Map<Character ,Integer> map = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            char[] chars = string.toCharArray();
            for (int i =0;i<chars.length;i++){
                if (chars[i]>='A' && chars[i]<='Z'){
                    sb.append(chars[i]);
                }
            }
            //统计sb中A-Z出现的次数
            for (int i =0;i<string1.length();i++){
                map.put(string1.charAt(i),0);//A-Z统计在map中
            }
            for (int i=0;i<sb.length();i++){
                if(map.containsKey(sb.charAt(i))){
                    map.replace(sb.charAt(i),map.get(sb.charAt(i))+1);
                }
            }
            //遍历map
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
