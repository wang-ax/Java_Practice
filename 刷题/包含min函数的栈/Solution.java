package 包含min函数的栈;

import java.util.Stack;

/**
 * ClassName 包含min函数的栈
 * Description TODO
 * Author 30712
 * Date 2021-01-24
 * Time 22:47
 */
public class Solution {
    //用两个栈实现最小栈
    //Deque是双端队列，有栈和队列的性质

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(min.empty()){
            min.push(node);
        }else{
            int t = min.peek();
            if(node < t){
                min.push(node);
            }else{
                min.push(t);
            }
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}
