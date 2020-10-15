class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

}
public class Operation {
    //所有的静态上下文都不能有this
    //头插
    public static Node addFirst(Node head, int e) {
        Node node = new Node(e);
        if (head == null) {
            head = node;
        }
        node.next = head;
        head = node;
        return head;
    }

    //尾插
    public static Node addLast(Node head, int e) {
        Node node = new Node(e);
        if (head == null) {
            head = node;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        return head;

    }

    //头删
    public static Node removeFirst(Node head) {
        if (head == null) {
            System.out.println("没有结点可以删除");
        }
        //使头结点的下一个节点变为头结点，head指向head的next
        head = head.next;
        return head;
    }

    //尾删
    public static Node removeLast(Node head) {
        if (head == null) {
            System.out.println("没有结点可以删除");
        } else if (head.next == null) {
            head = null;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = null;
        }
        return head;
    }

    public static void print(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur + " ");
            cur = cur.next;
        }
    }
}
