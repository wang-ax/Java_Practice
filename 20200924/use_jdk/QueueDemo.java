package use_jdk;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName QueueDemo
 * Description TODO
 * Author 30712
 * Date 2020-09-24
 * Time 16:59
 */
public class QueueDemo {
    public static void main(String[] args) {
        //先进先出
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
//检索队列的头，只看不取
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue.element());

//检索并删除
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue.poll());//返回null
        //System.out.println(queue.remove());//抛异常

        System.out.println(queue.isEmpty());//返回true

    }
}
