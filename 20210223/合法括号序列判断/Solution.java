package 合法括号序列判断;

import java.util.Stack;

/**
 * ClassName 合法括号序列判断
 * Description TODO
 * Author 30712
 * Date 2021-02-23
 * Time 17:23
 */
public class Solution {
    public boolean chKParenthesis(String A,int n){
        Stack<Character> lefts = new Stack<>();
        if (A == null || A.length()!= n){
            return false;
        }
        for (int i=0;i< n;i++){
            if (A.charAt(i) == '('){//遇到左括号进入栈
                lefts.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){//遇到右括号，弹出栈顶的元素
                if (lefts.isEmpty()){//如果此时栈为空，返回false
                    return false;
                }else {
                    lefts.pop();
                }
            }else {//其他情况直接返回false
                return false;
            }
        }
        //字符串结尾，栈非空，说明左括号多余了，返回false
        if (!lefts.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
}
