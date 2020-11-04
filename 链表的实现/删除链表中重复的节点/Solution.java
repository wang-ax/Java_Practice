package MyLinkedList.删除链表中重复的节点;


/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 16:59
 */
class ListNode {
    int val;
    ListNode next;
    ListNode (int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode deleteDuplication (ListNode head) {
        ListNode newHead = new ListNode(-1);//建一个傀儡节点
        ListNode tmp = newHead;
        ListNode current = head;
        while (current != null) {
            if(current.next != null && current.val == current.next.val) {
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                current = current.next;
            } else {
                tmp.next = current;
                tmp =current;
                current = current.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
}
