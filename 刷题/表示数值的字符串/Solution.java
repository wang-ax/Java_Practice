package 表示数值的字符串;

/**
 * ClassName 表示数值的字符串
 * Description TODO
 * Author 30712
 * Date 2021-01-17
 * Time 23:15
 */
public class Solution {
    public boolean isNumeric(char[] str) {
        if (str.length == 0){
            return false;
        }
        if (str.length == 1){
            if (str[0] < '0' || str[0] >'9'){
                return false;
            }
        }
        //标记字符串中是否含有标记符号、小数点、e
        boolean sign = false, decimal = false, hasE = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'e' || str[i] == 'E') {
                if (i == str.length-1) {
                    return false; // e后面一定要接数字
                }
                if (hasE) {
                    return false;  // 不能同时存在两个e
                }
                hasE = true;
            } else if (str[i] == '+' || str[i] == '-') {
                // 第二次出现+-符号，则必须紧接在e之后
                if (sign && str[i-1] != 'e' && str[i-1] != 'E') {
                    return false;
                }
                // 第一次出现+-符号，且不是在字符串开头，则也必须紧接在e之后
                if (!sign && i > 0 && str[i-1] != 'e' && str[i-1] != 'E') {
                    return false;
                }
                sign = true;
            } else if (str[i] == '.') {
                // e后面不能接小数点，小数点不能出现两次
                if (hasE || decimal) {
                    return false;
                }
                decimal = true;
            } else if (str[i] < '0' || str[i] > '9') {// 不合法字符
                return false;
            }
        }
        return true;
    }
}
