package MyLinkedList.环形链表II;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-04
 * Time 22:06
 */
class  Node{
    int val;
    Node next;
    Node (int val,Node next) {
        this.val = val;
        this.next = next;
    }
}
public class Main {
    public Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return  null;
        }
        //起始位置到入口点  与  相遇点到入口点 距离相等
        //slow拉到head位置，slow往后走，fast往前走，直到slow和fast相遇
        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
