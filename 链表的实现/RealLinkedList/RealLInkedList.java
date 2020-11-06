package RealLinkedList;
/**
 * ClassName RealLInkedList
 * Description TODO
 * Author 30712
 * Date 2020-11-05
 * Time 15:39
 */
//无头双向链表实现
public class RealLInkedList {
    //维护一个头节点和一个尾节点
    public ListNode head;
    public ListNode tail;
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //尾插法
    public void addLast (int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node ;
            this.tail = node;
        }else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
    //打印链表
    public void display() {
        ListNode current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
    //在任意位置插入，第一个数据节点为0号下标
    public void addIndex (int index ,int data) {
        //判断index是否合法
        if(index < 0 || index >size() ){
            return;
        }
        if(index == 0) {
            addFirst(data);//使用头插
            return;
        }
        if(index == size()) {
            addLast(data);//使用尾插
            return;
        }
        ListNode current = SearchIndex(index);
        ListNode node = new ListNode(data);

        node.next = current;
        node.prev = current.prev;
        current.prev.next = node;
        current.prev = node;
    }
    //找index位置
    private ListNode SearchIndex(int index) {
        ListNode current = this.head;
        while (index > 0) {
            current =current.next;
            index --;
        }
        return current;
    }
    //链表长度
    public int size() {
        ListNode current = this.head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode current = this.head;
        while (current != null) {
            if(current.data == key) {
                //判断删除的是不是头结点
                if(current == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    current.prev.next = current.next;
                    //判断删除的是不是尾节点
                    if(current.next != null) {
                        current.next.prev = current.prev;
                    }else {
                        this.tail = current.prev;//删除的是尾节点
                     }
                }
                return ;//删除完成
            }
            current = current.next;
        }
    }

    //删除所有值为key的节点
    public void removeAll(int key) {
        ListNode current = this.head;
        while (current != null) {
            if(current.data == key) {
                //判断删除的是不是头节点
                if(current == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    current.prev.next = current.next;
                    //判断删除的是不是尾节点
                    if(current.next != null) {
                        current.next.prev = current.prev;
                    }else {
                        this.tail = current.prev;
                    }
                }
            }
            current = current.next;
        }
    }

    //
    public  void clear() {
        ListNode current = this.head;
        while (current != null) {
            ListNode currentNext = current.next;
            current.next = null;
            current.prev = null;
            current = currentNext;
        }
        this.head = null;
        this.tail = null;
    }

    //查看是否包含关键字key是否在单链表中
    public  boolean contains (int key) {
        ListNode current = this.head;
        while (current != null) {
            if(current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
