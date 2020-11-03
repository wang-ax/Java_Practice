package MyLinkedList.移除链表元素;
/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 15:00
 */
class Node {
    public int data;
    public Node next;
    public Node (int data) {
        this.data = data;
    }

}
public class Solution {
    public  Node head;
    public void removeAllKey (int key) {
        if(this.head == null) {
            return;
        }
        Node prev = this.head;
        Node current = this.head.next;

        while (current != null) {
            if(current.data == key) {
                prev.next = current.next;//前驱节点的引用指向current.next指向的对象
                current = current.next;//current继续往后走
            }else {
                prev = current;
                current = current.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
}
