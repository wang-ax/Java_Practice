package leetcode.copy_list_with_random_pointer;

public class SimpleListCopy {
    public static SimpleNode copy(SimpleNode head) {
        SimpleNode newFakeHead = new SimpleNode(-1);
        SimpleNode newLast = newFakeHead;

        SimpleNode current = head;
        while (current != null) {
            SimpleNode newNode = new SimpleNode(current.val);
            // 把 newNode 尾插到新的链表上
            newLast.next = newNode;
            newLast = newNode;

            current = current.next;
        }

        return newFakeHead.next;
    }
}
