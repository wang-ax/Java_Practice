package _58_length_of_last_word;

/**
 * ClassName _58_length_of_last_word
 * Description TODO
 * Author 30712
 * Date 2021-02-09
 * Time 12:40
 */
public class Solution {
    public  static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int count =0;
        for (int i =chars.length-1;i>=0;i--){
            if (chars[i] == ' '){
                if (count == 0){
                    continue;
                }
                break;
            }
            if (chars[i] != ' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
        System.out.println(lengthOfLastWord(" "));
        System.out.println(lengthOfLastWord("my family is"));
        System.out.println(lengthOfLastWord("a "));
    }
}
