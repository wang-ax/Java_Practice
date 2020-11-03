package MyLinkedList.反转链表;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 15:12
 */
class ListNode {
    int val;
    ListNode next;
    ListNode (int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode reverseList (ListNode head) {
        ListNode newHead = null;//新链表的头节点
        ListNode current = head;//当前需要反转的节点
        ListNode prev = null;//当前需要反转的节点的前驱节点
        while (current != null) {
            ListNode currentNext = current.next;//保存current.next
            if (currentNext == null) {
                newHead = current;
            }
            current.next = prev;
            prev = current;
            current = currentNext;
        }
        return newHead;
    }
}
