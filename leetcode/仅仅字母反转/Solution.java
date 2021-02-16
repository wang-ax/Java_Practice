package 仅仅字母反转;

import java.util.Stack;

/**
 * ClassName 仅仅字母反转
 * Description TODO
 * Author 30712
 * Date 2021-02-16
 * Time 16:23
 */
public class Solution {
    public String reverseOnlyLetters(String  S){
        //将所有的字母存入栈中
        Stack<Character> stack = new Stack<>();
        for (char c :S.toCharArray()){
            if (Character.isLetter(c)){
                stack.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c: S.toCharArray()){
            if (Character.isLetter(c)){
                sb.append(stack.pop());
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public String reverseOnlyLetters2(String  S){
        //双指针
        char[] array = S.toCharArray();
        int i =0;
        int j = array.length-1;
        char c;
        while (i < j){
            //i 和j都是字母
            if (Character.isLetter(array[i]) && Character.isLetter(array[j])){
                //交换
                 c = array[i];
                array[i] = array[j];
                array[j] = c;
                i++;
                j--;
            }
            //i指向的不是字母
            if (!Character.isLetter(array[i])){
                i++;
            }
            //j指向的不是字母
            if (!Character.isLetter(array[j])){
                j--;
            }
        }
        //数组转为字符串
        StringBuilder sb = new StringBuilder();
        for (Character ch : array){
            sb.append(ch);
        }
        return sb.toString();
    }
}
