import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName MyStack
 * Description TODO
 * Author 30712
 * Date 2020-09-25
 * Time 22:01
 */
//用队列实现栈，可以使用队列的各种操作，手中只有队列，但对外表现出的是一个栈的样子
//进栈：A B　C　D
//出栈：D C  B  A
public class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        //直接使用add() 进入 A B C D
        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = queue.size();
        for(int i = 0 ;i < size -1 ;i++) {
            Integer e = queue.remove();
            queue.add(e);
        }
        return queue.remove();
    }

    /** Get the top element. */
    public int top() {
        int size = queue.size();
        for(int i = 0; i< size -1 ;i++) {
            Integer e  = queue.remove();
            queue.add(e);
        }
        Integer t =queue.remove();
        queue.add(t);
        return t;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return  queue.isEmpty();
    }
}
