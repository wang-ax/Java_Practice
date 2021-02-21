package 第一次只出现一次的字符;

/**
 * ClassName 第一次只出现一次的字符
 * Description TODO
 * Author 30712
 * Date 2021-02-21
 * Time 22:55
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        //第一个只出现一次的字符
        int[] cnts=new int[128];
        //记录每一个字符出现的次数
        for(int i=0;i<str.length();i++){
            cnts[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(cnts[str.charAt(i)]==1)//如果是1，就直接return
                return i;
        }
        return -1;
    }
}
