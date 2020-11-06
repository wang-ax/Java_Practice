package MyLinkedList.合并两个有序链表;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-06
 * Time 20:09
 */
class ListNode {
    int val;
    ListNode next;
    ListNode (int val) {
        this.val =val;
    }
}
public class Solution {
    public ListNode mergeTwoLists(ListNode headA,ListNode headB) {
        ListNode newHead = new ListNode (-1);
        ListNode tmp = newHead;
        //两个链表中都有数据
        while (headA != null && headB != null) {
            if(headA.val < headB.val) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else{
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        //两种情况
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
}
