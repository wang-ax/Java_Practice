package 从尾到头打印链表;

import java.util.ArrayList;

/**
 * ClassName 从尾到头打印链表
 * Description TODO
 * Author 30712
 * Date 2021-01-17
 * Time 22:32
 */
class ListNode{
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ArrayList<Integer>  printListFromTailToHead(ListNode listNode) {
        /**
         由于是将链表从尾部往头部打印，所以想到使用栈
         */
        /*ArrayList<Integer> list = new ArrayList<>();
        //利用栈将链表的val值存入栈中
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }

        return list;*/

        /**
         * 基于链表使用头插法实现
         */
        ListNode head = new ListNode(-1);
        while (listNode != null){
            ListNode node = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = node;
        }
        ArrayList<Integer>  list = new ArrayList<>();
        head = head.next;
        while (head !=null){
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

}
