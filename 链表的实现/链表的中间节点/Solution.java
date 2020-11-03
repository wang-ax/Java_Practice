package MyLinkedList.链表的中间节点;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 15:20
 */
class  ListNode {
    public int val;
    public ListNode next;
    public ListNode (int val){
        this.val = val;
    }
}
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
