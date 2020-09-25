package bracket;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-09-25
 * Time 21:04
 */
public class Solution {
    public boolean isValid(String s) {
        //1.准备一个栈
        Deque<Character> stack = new LinkedList<>();
        //2.遍历String字符串的每一个字符
        char[] charArray  = s.toCharArray();
        for(char c : charArray) {
            switch(c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;

                default: {
                    //右括号
                    if(stack.isEmpty()) {
                        //右括号多了
                        return false;
                    }
                    //否则取出栈顶元素
                    char left = stack.pop();
                    if(!compareBracket(left ,c)) {
                        //左右括号不匹配
                        return  false;
                    }
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            //证明是左括号多了
            return false;
        }
    }
    private  boolean compareBracket (char left ,char right) {
        if(left == '(' && right == ')') {
            return  true;
        }
        if(left == '[' && right ==']') {
            return  true;
        }
        if(left == '{' && right == '}') {
            return  true;
        }
        return false;
    }
}
