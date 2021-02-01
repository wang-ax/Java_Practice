package day31.说返回;

import java.util.Scanner;

/**
 * ClassName day31.说返回
 * Description TODO
 * Author 30712
 * Date 2021-02-01
 * Time 16:08
 */
public class Main {
    public static void main(String[] args) {
        //将句中所有单词的顺序颠倒输出
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            System.out.println(reverseSentence(string));
        }
    }

    private static StringBuilder reverseSentence(String string) {
        //翻转句子
        //Hello World Here I Come
        int beginIndex =0;
        char[] ch = string.toCharArray();
        reverseWord(ch,0,ch.length-1);
        //meoC I ereH dlroW olleH
        for (int i=0;i<=ch.length-1;i++){
            if (ch[i] == ' '){
                reverseWord(ch,beginIndex,i-1);
                beginIndex = i+1;
            }else if (i == string.length()-1){
                reverseWord(ch,beginIndex,i);
            }
        }
        //数组转为字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0;i<ch.length;i++){
            stringBuilder.append(ch[i]);
        }
        return stringBuilder;
    }
    //颠倒单词的顺序
    private static void reverseWord(char[] ch, int beginIndex, int endIndex) {
        while (beginIndex < endIndex){
            char c = ch[beginIndex];
            ch[beginIndex] = ch[endIndex];
            ch[endIndex] = c;
            beginIndex++;
            endIndex--;
        }
    }
}
