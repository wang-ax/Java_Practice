package MyLinkedList.链表分割;


/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 15:38
 */
class  ListNode {
    int val;
    ListNode next;
    ListNode (int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode partition (ListNode head , int x) {
        //小于x的节点
        ListNode bs = null;//start
        ListNode be = null;//end
        //大于x的节点
        ListNode as = null;//start
        ListNode ae = null;//end

        ListNode cur = head;//使用cur来遍历链表
        while (cur != null) {
            if(cur.val < x) {
                //在前半段进行尾插
                //先判断是不是第一次尾插
                if(bs == null) {
                    bs = cur;
                    be = bs;
                }else {
                    be.next = cur;
                    be = cur;
                }
            }else {
                //是大于x的节点，在后半段进行尾插
                //先判断是不是第一次尾插
                if(as == null) {
                    as = cur;
                    ae = as;
                }else {
                    ae.next = cur;
                    ae = cur;
                }
            }
            cur = cur.next;
        }
        if(bs == null) {
            return as;
        }
        be.next = as;//连接
        if(as != null) {
            ae.next = null;//防止死循环
        }
        return bs;
    }
}
