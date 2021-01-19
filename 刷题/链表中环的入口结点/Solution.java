package 链表中环的入口结点;

/**
 * ClassName 链表中环的入口结点
 * Description TODO
 * Author 30712
 * Date 2021-01-19
 * Time 11:33
 */
class  ListNode{
    public int val;
    ListNode next =null;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        slow = pHead;
        while (slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
