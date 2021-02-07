package _383_ransome_note;

/**
 * ClassName _383_ransome_note
 * Description TODO
 * Author 30712
 * Date 2021-02-07
 * Time 16:08
 */
public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        //判断第一个字符能不能由第二个字符串里面的字符构成
        //magazine中包含ransomeNote
        //杂志中每个字符串只能在赎金信字符串中使用一次
        if (ransomNote.length() > magazine.length()){
            //第一个字符串长度大于第二个字符串的长度，结果为false
            return false;
        }
        int[] chars = new int[26];
        for (int i =0;i< ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            int index = magazine.indexOf(c,chars[c-'a']);
            //String.indexOf(a,b)从b索引开始找a字符
            if (index == -1){
                return  false;
            }
            chars[c -'a'] = index +1;
        }
        return true;
    }
    public static void main(String[] args) {
        String string1 = "aaa";
        String stirng2 = "aaab";
        System.out.println(canConstruct(string1, stirng2));
    }
}
