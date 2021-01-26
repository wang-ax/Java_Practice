package 翻转单词顺序列;

/**
 * ClassName 翻转单词顺序列
 * Description TODO
 * Author 30712
 * Date 2021-01-26
 * Time 18:53
 */
public class Solution {
    public static String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        int len = str.length();
        reverse(chars,0, len-1);
        int t =0;//起始坐标
        for (int i =0;i< len;i++){
            if (chars[i] == ' '){//当i遇到空格时，说明一个单词结束了
                reverse(chars,t,i-1);
                t = i+1;//更新单词的起始坐标
            }else if (i ==len -1){//当i指向最后一个字符时，说明整个句子结束了，也即最后一个单词结束了。
                reverse(chars,t,i);
            }
        }
        String result = "";
        for (int i=0;i < len;i++){//遍历数组把数组转成字符串。
            result +=chars[i];
        }
        return result;
    }

    private static void reverse(char[] chars, int begin, int end) {
        while (begin < end){
            char t = chars[begin];
            chars[begin] = chars[end];
            chars[end] = t;
            begin++;
            end--;
        }
    }
    public static void main(String[] args) {
        System.out.println(ReverseSentence("I am a student."));
    }
}
