package shopee.mianshi;

import java.util.Arrays;

/**
 * ClassName shopee.mianshi
 * Description TODO 字符串找不同
 * Author 30712
 * Date 2021-09-27
 * Time 19:40
 */
public class Solution2 {
    public static void main(String[] args) {

    }
    public char findTheDifference(String s,String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.toString(t1);
        for(int i =0;i< s1.length;i++){
            if (s1[i] != t1[i]){
                return t1[i];
            }
        }
        return t1[t1.length-1];
    }
}
