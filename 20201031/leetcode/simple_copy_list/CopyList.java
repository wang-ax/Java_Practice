package leetcode.simple_copy_list;

/**
 * ClassName CopyList
 * Description TODO
 * Author 30712
 * Date 2020-10-31
 * Time 15:12
 */
//复制链表
public class CopyList {
    public SimpleNode copyList (SimpleNode head) {
        SimpleNode newFakeNode = new SimpleNode(-1);
        SimpleNode newLast = newFakeNode;
        SimpleNode current = head;
        while (current != null) {
            //尾插
            SimpleNode newNode = new SimpleNode(current.val);
            newLast.next = newNode;
            newLast = newNode;
            current = current.next;
        }
        return newFakeNode.next;
    }
}
