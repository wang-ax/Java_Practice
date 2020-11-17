import java.util.PriorityQueue;

/**
 * ClassName PriorityQueueTest
 * Description TODO
 * Author 30712
 * Date 2020-11-17
 * Time 11:11
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(9);
        queue.add(6);
        queue.add(5);
        queue.add(8);
        queue.add(4);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
