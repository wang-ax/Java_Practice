package day20.链表分割;

/**
 * ClassName day20.链表分割
 * Description TODO
 * Author 30712
 * Date 2021-01-20
 * Time 17:58
 */
class ListNode{
    public  int val;
    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    /**
     * 所有小于x的结点排在大于或等于x的结点之前（小的在前，大的在后），返回重新排列后的链表的头指针
     * 分割以后保持原来的数据顺序不变
     * @param pHead
     * @param x
     * @return
     */
    public ListNode partition(ListNode pHead,int x){
        //小于x的结点
        ListNode bs = null;
        ListNode be = null;
        //大于x的结点
        ListNode as = null;
        ListNode ae = null;

        ListNode current = pHead;//用来遍历链表

        while (current != null){
            //小于x的结点
            if (current.val < x){
                if (bs == null){
                    bs = current;
                    be = bs;
                }else {
                    be.next = current;
                    be = current;
                }
            }else {
                //大于x的结点
                if (as == null){
                    as = current;
                    ae = as;
                }else {
                    ae.next = current;
                    ae = current;
                }
            }
            current = current.next;
        }
        if (bs == null){
            return as;//全部都是大于x的结点
        }
        be.next = as;
        if (as != null){
            ae.next = null;
        }
        return bs;
    }
}
