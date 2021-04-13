/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-04-13
 * Time 17:35
 */
class Node {
    public  int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
//反转链表
public class ReverseList {
    public static Node  reverse(Node head){
        if (head == null){
            return  null;
        }
        //反转链表
        Node prev = null;//前一个结点
        Node current = head;//当前结点
        while (current != null){
            Node temp = current.next;//将下一个结点保存
            current.next = prev;//让当前的结点指向前一个结点
            prev = current;//前一个结点往后移
            current = temp;//当前结点往后移
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1=  head.next  = new Node (2);
        Node node2 = node1.next = new Node(3);
        System.out.println(reverse(head));
    }
}
