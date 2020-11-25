import java.util.Deque;
import java.util.LinkedList;
/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-11-25
 * Time 15:13
 */
public class Parenthesis {
    public  static  boolean chkParenthesis(String A, int n) {
        //如果是左括号就进栈，如果碰到不是括号的直接return false
        //碰到右括号就从取栈顶元素
        Deque<Character> stack = new LinkedList<>();//放字符
        char[] chars = A.toCharArray();
        //遍历字符数组
        for (char c : chars) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                default: {
                    if (stack.isEmpty()) {
                        return false;//右括号多了
                    }
                    char left = stack.pop();
                    if (!compareBracket(left, c)) {
                        return false;//不匹配
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    private  static  boolean compareBracket(char left, char c) {
        if(left !=')' && c !=')' ) {
            return false;
        }
       return true;
    }

    public static void main(String[] args) {
        String str = "()(()()";
        int n = str.length();
        System.out.println(chkParenthesis(str, n));
    }
}
