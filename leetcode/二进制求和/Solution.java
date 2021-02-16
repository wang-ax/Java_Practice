package 二进制求和;

/**
 * ClassName 二进制求和
 * Description TODO
 * Author 30712
 * Date 2021-02-16
 * Time 17:13
 */
public class Solution {
    public String addBinary(String a, String b) {
        //位运算
        StringBuilder sb = new StringBuilder();
        int n = Math.max(a.length(),b.length());
        int cur =0;
        for (int i = 0; i < n; ++i) {
            cur += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            cur += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            sb.append((char) (cur % 2 + '0'));
            cur /= 2;
        }
        if (cur > 0) {
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }
    public String addBinary2(String a, String b) {
        //反转字符串
        StringBuffer s1 = new StringBuffer();
        s1.reverse();
        StringBuffer s2 = new StringBuffer();
        s2.reverse();
        //将两个字符串变成相同的长度
        if (s1.length() > s2.length()){
            int n = s1.length() - s2.length();
            for (int i=0;i< n;i++){
                s2.append('0');
            }
        }else if(s1.length() < s2.length()){
            int n = s2.length() - s1.length();
            for (int i =0;i< n;i++){
                s1.append('0');
            }
        }
        //两个字符串求和
        StringBuffer  sb = new StringBuffer();
        int i =0;
        char flag ='0';//存放进位值的字符变量
        while (i < s1.length() && i < s2.length()){
            if(flag == '0'){
                if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == '1'){
                    flag = '1';
                    sb.append('0');
                }else if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == '0'){
                    sb.append('0');
                }else {
                    sb.append('1');
                }
            }else {
                if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == '1'){
                    flag = '1';
                    sb.append('1');
                }else if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == '0'){
                    flag = '0';
                    sb.append('1');
                }else {
                    flag = '1';
                    sb.append('0');
                }
            }
            i++;
        }
        if (flag == '1'){
            sb.append(flag);
        }
        sb.reverse();
        return sb.toString();
    }
}
