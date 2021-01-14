package 左旋转字符串;

/**
 * ClassName 左旋转字符串
 * Description TODO
 * Author 30712
 * Date 2021-01-14
 * Time 9:54
 */
public class Solution {
    public  static String LeftRotateString(String str,int n) {
        //n大于字符串的长度，直接返回该字符串
        if (n > str.length()){
            return str;
        }
        //从字符串中取出前n位，然后再增加到取完之后的字符串后面
        //字符串转为字符数组
        char[] chars = str.toCharArray();
        char[] newChars = new char[n];
        for (int i =0;i< n;i++){
            newChars[i] = chars[i];
        }
        //将前n个字符组成的字符数组转成字符串
        String str1 = new String(newChars);
        //字符串拼接
        String  endString = str.substring(n,str.length())+str1;
        return  endString;
    }

    public static void main(String[] args) {
        String string = "";
        int n =6;
        System.out.println( LeftRotateString(string,n));
    }
}
