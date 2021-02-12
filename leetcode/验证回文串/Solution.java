package 验证回文串;

/**
 * ClassName 验证回文串
 * Description TODO
 * Author 30712
 * Date 2021-02-12
 * Time 21:56
 */
public class Solution {
    public  static boolean isPalindrome(String s) {

/**
 * 对字符串s进行遍历，将其中的字母和数字字符保留，放在另一个字符串中
 * 使用reverse得到逆序字符串
 * 只要这两个字符串相同就是回文串
 */
        /*StringBuilder string = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                string.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder stringReverse = new StringBuilder(string).reverse();
        return string.toString().equals(stringReverse.toString());*/
        /**
         * 双指针
         */
        /*StringBuilder string = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                string.append(Character.toLowerCase(ch));
            }
        }
        int left = 0;
        int right = string.length();
        while (left < right){
            if (Character.toLowerCase(string.charAt(left)) != Character.toLowerCase(string.charAt(right))){
                return false;
            }
            ++left;
            --right;
        }
        return true;*/

        /**
         * 在原字符串上直接判断
         */
        int left = 0;
        int right = s.length()-1;
        while (left  < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
