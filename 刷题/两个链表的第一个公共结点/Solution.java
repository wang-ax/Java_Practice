package 两个链表的第一个公共结点;

/**
 * ClassName 两个链表的第一个公共结点
 * Description TODO
 * Author 30712
 * Date 2021-01-12
 * Time 15:19
 */
class  ListNode{
    public  int val;
    public  ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    //传入的是两个链表的头结点
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null){
            return null;
        }
        int len1 =0;
        int len2 =0;
        ListNode pl = pHead1;
        ListNode ps = pHead2;
        while (pl != null){
            len1++;
            pl = pl.next;
        }
        while (ps != null){
            len2++;
            ps = ps.next;
        }
        pl = pHead1;
        ps = pHead2;
        int len = len1 -len2;
        if (len < 0){
            ps = pHead1;
            pl = pHead2;
            len = len2 - len1;
        }
        while (len > 0){
            len--;
            pl = pl.next;
        }
        while (pl != null && ps != null && pl != ps){
            pl = pl.next;
            ps = ps.next;
        }
        if (pl == ps && pl != null){
            return pl;
        }
        return null;
    }
}
