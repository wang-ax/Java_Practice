package day5;

import java.util.Stack;

/**
 * ClassName day5
 * Description TODO 两个栈实现队列
 * Author 30712
 * Date 2020-11-27
 * Time 23:34
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //直接压入stack2中
        stack2.push(node);
    }
    public int pop() {
        //stack1为空时，先把元素从stack2取出来，放入stack1中
        if(stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                Integer e = stack2.pop();
                stack1.push(e);
            }
        }
        //从stack1弹出栈顶元素
        return stack1.pop();
    }
}
