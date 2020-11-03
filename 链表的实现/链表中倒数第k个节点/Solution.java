package MyLinkedList.链表中倒数第k个节点;


/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 15:25
 */
class  ListNode {
    public int val;
    public  ListNode next;
    public ListNode (int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (k <= 0 || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("K 值过大！");
                return null;
            }
        }
        while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
        }
        return slow;
    }
}
