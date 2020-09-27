import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName MinStack
 * Description TODO
 * Author 30712
 * Date 2020-09-27
 * Time 8:43
 */
public class MinStack {
    private Deque<Integer> s1;
    private Deque<Integer> s2;
    /** initialize your data structure here. */
    public MinStack() {
        //s1 为普通栈，s2 为小数栈
        s1 = new LinkedList<>();
        s2 = new LinkedList<>();
    }
    public void push(int x) {s1.push(x);//把x压入普通栈
        if(s2.isEmpty()) {//如果小数栈为空，x压入小数栈
            s2.push(x);
        } else {
            int t = s2.peek();//小数栈不为空，将x与小数栈的栈顶元素进行比较，结果小的压入小数栈
            if(x < t) {
                s2.push(x);
            } else {
                s2.push(t);
            }
        }
    }
    public void pop() {
        s1.pop();
        s2.pop();
    }
    public int top() {
        return s1.peek();
    }
    public int getMin() {
        return s2.peek();
    }
}
