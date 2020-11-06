package MyLinkedList.相交链表;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-06
 * Time 11:01
 */
 class ListNode {
     int val;
     ListNode next;
     ListNode (int val) {
         this.val = val;
     }
}
public class Main {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        int lenA =0;
        int lenB = 0;
        ListNode pl = headA;
        ListNode ps = headB;
        //计算两个链表的长度
        while (pl != null) {
            lenA++;
            pl = pl.next;
        }
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len < 0) {
            //说明长链表是headB，短链表是headA
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //让pl先走len步
        while (len < 0) {
            len--;
            pl = pl.next;
        }
        //pl和ps同时走
        while (pl != null && ps != null && ps != pl) {
            pl = pl.next;
            ps = ps.next;
        }
        if(ps == pl && pl != null) {
            return pl;//相交
        }
        return null;//没有交点
    }
}
