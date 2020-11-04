package MyLinkedList.判断链表是否有环;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-04
 * Time 21:41
 */
class  Node {
    int val;
    Node next;
    Node (int val,Node next) {
        this.val = val;
        this.next = next;
    }

}
public class Main {
    public boolean hasCycle(Node head) {
        Node fast =  head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        //有两种情况：
        if (fast == null || fast.next == null) {
            return false;//说明是由于fast 或者 fast.next 不满足条件，所以退出循环
        }
        return true;//由于break，退出循环
    }
}
