package 替换空格;

/**
 * ClassName 替换空格
 * Description TODO 将一个字符串中的每个哦那个个替换成"%20"
 * Author 30712
 * Date 2021-01-22
 * Time 15:05
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        //
        if (str == null || str.length() == 0){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i =0;i< str.length();i++){
            char c = str.charAt(i);
            if (c == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
