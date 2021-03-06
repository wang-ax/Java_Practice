/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-06
 * Time 9:06
 */
class Node{
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(int val) {
        this.val = val;
    }
}
public class MyQueue {
    private Node head = null;
    private Node tail = null;
    private int size =0;
    public void offer(int v){//从队尾进行插入
        Node node = new Node(v);
        if (tail == null){
            head = node;
        }else {
            tail.next = node;
        }
        tail = node;
        size++;
    }
    public int poll(){//从队首进行删除
        if (size == 0){
            throw new RuntimeException("队列为空");
        }
        Node oldHead = head;
        head  =head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return oldHead.val;//返回的是队首元素的值
    }
    public int peek(){//取出队首元素
        if (size == 0){
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public int size(){
        return size;
    }
}
