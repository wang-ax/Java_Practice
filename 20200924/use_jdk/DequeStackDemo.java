package use_jdk;

import java.util.Date;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName DequeStackDemo
 * Description TODO
 * Author 30712
 * Date 2020-09-24
 * Time 21:47
 */
public class DequeStackDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
