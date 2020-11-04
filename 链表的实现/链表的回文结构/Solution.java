package MyLinkedList.链表的回文结构;

import java.util.List;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-04
 * Time 20:30
 */
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class Solution {
    public boolean chkPalindrome(ListNode A) {
        if(A == null) {
            return false;
        }
        if(A.next == null) {
            return true;
        }
        // 先找到中间节点
        ListNode fast = A;
        ListNode slow = A;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        ListNode current  = slow;
        while (current != null) {
            ListNode currentNext = current.next;
            current.next = slow;
            slow = current;
            current = currentNext;
        }
        //一个往前走，一个往后走 ，判断val是否相同
        while (A != slow) {
            if(A.val != slow.val) {
                return false;
            }
            //为偶数情况写的，必须在A.val == slow.val 的后面
            if(A.next == slow) {
                return true;
            }
            A = A.next;
            slow = slow.next;
        }
        return true;
    }
}
