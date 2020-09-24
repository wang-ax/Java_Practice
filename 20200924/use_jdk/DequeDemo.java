package use_jdk;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName DequeDemo
 * Description TODO
 * Author 30712
 * Date 2020-09-24
 * Time 17:18
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        /**
         *
         */
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        deque.add(7);
       //add 是Deque自己特殊的，使用的是addLast，所以是1，2，3，4，5，6，7
        System.out.println(deque);//1，2，3，4，5，6，7
        System.out.println(deque.removeLast());//7
        System.out.println(deque.removeLast());//6
        System.out.println(deque.removeFirst());//1
        System.out.println(deque);//2，3，4，5


        /**
         *
         */
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);

        while (! deque.isEmpty()) {
            if(! deque.isEmpty()) {
                System.out.println(deque.getFirst());
            }
            if(! deque.isEmpty()){
                System.out.println(deque.removeFirst());
            }
            if(! deque.isEmpty()) {
                System.out.println(deque.getLast());
            }
            if(! deque.isEmpty()) {
                System.out.println(deque.removeLast());
            }
        }
    }
}
