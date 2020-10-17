import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ClassName PriorityQueueDemo
 * Description TODO
 * Author 30712
 * Date 2020-10-15
 * Time 17:36
 */
public class PriorityQueueDemo {
    public static void main1(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(3);
        queue.add(4);
        queue.add(7);
        queue.add(8);
        queue.add(2);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

    public static void main(String[] args) {
        PriorityQueue<Person> queue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Person p1 = new Person("a",18);
        Person p2 = new Person("b",23);
        Person p3 = new Person("c",14);
        Person p4 = new Person("f",20);
        Person p5 = new Person("g",16);

        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        queue.add(p4);
        queue.add(p5);

        System.out.println(queue.remove());

    }
}
