package 合并两个有序链表;

/**
 * ClassName 合并两个有序链表
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 18:48
 */
class  ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        //两个链表都是有序的
        //一定是需要一个新的链表，将list1和list2的元素
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        //两个链表都有数据
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tmp.next = list1;
                tmp = tmp.next;
                list1 = list1.next;
            }else {
                tmp.next = list2;
                tmp = tmp.next;
                list2 = list2.next;
            }
        }
        //list1 == null 或者 list2 == null
        if (list1 != null){
            tmp.next = list1;
        }
        if(list2 != null){
            tmp.next = list2;
        }
        return newHead.next;
    }
}
