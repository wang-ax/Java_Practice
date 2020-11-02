package MyLinkedList;

/**
 * ClassName TestDemo
 * Description TODO
 * Author 30712
 * Date 2020-11-02
 * Time 21:25
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.addLast(7);
        myLinkedList.addLast(5);
        myLinkedList.addFirst(12);
        myLinkedList.remove(3);
        myLinkedList.removeAllKey(5);
        myLinkedList.remove(7);

        myLinkedList.display();

    }
}
