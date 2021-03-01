package 合并两个有序链表;

/**
 * ClassName 合并两个有序链表
 * Description TODO
 * Author 30712
 * Date 2021-03-01
 * Time 13:01
 */
class ListNode {
      int val;
      ListNode next;

      public ListNode(int val) {
          this.val = val;
      }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}


public class Solution {
    public static ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        //合并两个有序链表
        ListNode newHead = new ListNode(-1);//虚拟节点
        ListNode temp = newHead;
        //两个链表当前都有数据
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }else{
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        //
        if(l1 != null){
            //l1 剩下的所有数据都是比l2里面的数据大的
            temp.next = l1;
        }
        if(l2 != null){
            temp.next = l2;
        }
        return newHead.next;//返回虚拟节点的下一个节点
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);

        ListNode listNode1 = new ListNode(0);
        listNode1.next = new ListNode(3);

        ListNode twoLists = mergeTwoLists(listNode, listNode1);
        System.out.println(twoLists);

    }
}