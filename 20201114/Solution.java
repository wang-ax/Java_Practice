/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-14
 * Time 13:49
 */
import  java.util.Deque;
import java.util.LinkedList;
public class Solution {
    public boolean isValid (String s) {
        // write code here
        //使用栈，左括号就入栈，右括号就从栈中取出栈顶元素与之进行配对
        //最终判断栈中是否还有括号，字符串中是否还有剩余
        Deque<Character> stack = new LinkedList<>();
        char[] charArray = s.toCharArray();
        for(char c :charArray) {
            switch(c){
                case'(':
                case'[':
                case'{':
                    stack.push(c);
                    break;
                default:{
                    if(stack.isEmpty()) {
                        return false;
                    }
                    char left = stack.pop();
                    if(!compareBracket(left,c)) {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    private  boolean  compareBracket(char left,char right ){
        if(left == '(' && right == ')') {
            return true;
        }
        if(left == '[' && right == ']') {
            return true;
        }
        if(left == '{' && right == '}') {
            return true;
        }
        return false;
    }
}
