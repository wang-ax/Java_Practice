package shopee;

/**
 * ClassName shopee
 * Description TODO
 * Author 30712
 * Date 2021-09-22
 * Time 15:31
 */
//详细描述
//1. 转换后的字符串只保留字母[a-zA-Z]和数字[0-9]，去除其他字符；
//2. 输入字符串中的字母字符的前一字符如非字母或数字，该字母转换后为大写，其他字母转换后为小写；
//  例外：转换后的字符串第一个字符如果是字母，则该字母转换后为小写；
//3. 转换后的字符串保留数字字符。
//4. 字符串如果为空或者无[a-zA-Z]和数字[0-9]中字符，请默认输出如下字符串"shopee"

/**
 * "hello_world"
 * "helloWorld"
 *
 * "This is a Demo!"
 * "thisIsADemo"
 *
 * "_UPPER_CASE_"
 * "upperCase"
 *
 * "CapitalizedWords"
 * "capitalizedwords"
 *
 * "This is 5th example"
 * "thisIs5thExample"
  */

public class Solution1 {
    public static String camelCase(String newString) {
        // write code here
        newString = newString.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] chars = newString.toCharArray();
        if (newString == null ){
            return "shopee";
        }

        for (int i =0;i<chars.length;i++){
            //这个字符是非字母或者数字
            if (chars[i] == '_' || chars[i] == ' ' && (chars[i+1] <'0' || chars[i+1] >'9')){
                chars[i+1] = (char)(chars[i+1]-32);
                continue;
            }else if (chars[i] == '_' || chars[i] == ' ' && !(chars[i+1] <'0' || chars[i+1] >'9')){
                continue;
            }
            sb.append(chars[i]);
        }
        String string = sb.toString();
        char[] schar = string.toCharArray();
        if (schar[0] >='A' && schar[0] <= 'Z'){
            char c = (char) (string.charAt(0) + 32);
            schar[0] = c;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0;i< schar.length;i++){
            stringBuilder.append(schar[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("This is a Demo!"));
    }
}
