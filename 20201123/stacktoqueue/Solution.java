package stacktoqueue;

import java.util.Stack;

/**
 * ClassName stacktoqueue
 * Description TODO
 * Author 30712
 * Date 2020-11-23
 * Time 23:05
 */
public class Solution {
    //用两个栈来实现队列
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //入队列：直接压入到stack2中（无脑压入）
    public void push(int node) {
        stack2.push(node);
    }

    //出队列
    public int pop() {
        //如果stack1为空
        if(stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                //将stack2中的所有元素取出，放入stack1中
                Integer e = stack2.pop();
                stack1.push(e);
            }
        }
        //如果stack1不为空，直接从stack1中取出一个元素
        return stack1.pop();
    }

}
