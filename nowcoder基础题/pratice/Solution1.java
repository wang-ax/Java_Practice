package pratice;

import java.util.HashMap;

/**
 * ClassName Solution1
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 10:41
 */
public class Solution1 {
    public int firstUniqChar(String s) {
        //先找到每一个字符出现的次数
        HashMap<Character,Integer> count = new HashMap<Character, Integer>();
        for(int i =0;i< s.length();i++) {
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        //
        for(int i =0;i<s.length();i++){
            if(count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;

    }
}
