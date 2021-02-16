package 长按键入;

/**
 * ClassName 长按键入
 * Description TODO
 * Author 30712
 * Date 2021-02-16
 * Time 16:11
 */
public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                //两个字符串存在一对匹配的字符
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                //存在一次长按键入
                j++;
            } else {
                return false;//type中存在一个字符不能满足上面的两个条件，就直接返回false
            }
        }
        return i == name.length();//说明每个字符都匹配成功，结果为true
    }
}
