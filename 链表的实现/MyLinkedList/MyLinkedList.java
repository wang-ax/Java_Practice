package MyLinkedList;

/**
 * ClassName MyLinkedList
 * Description TODO
 * Author 30712
 * Date 2020-11-02
 * Time 20:10
 */
class Node {
    public  int data;
    public Node next;
    public Node (int data){
        this.data = data;

    }
}
//无头单向非循环链表
public class MyLinkedList {
    public Node head;//表示单链表的头节点
    //1.头插法
    public void addFirst(int data) {
        Node node = new Node(data);//建一个新的节点，把data放入
       /* if(head == null) {
            this.head  =node;
        }*/
        //如果head == null 直接执行下面的代码也是可以的
        node.next = this.head;//必须先将node.next 指向head
        this.head = node;
    }

    //2.尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            Node current = this.head;
            while (current.next != null) {//current.next == null 说明找到了尾巴
                current = current.next;
            }
            current.next = node;
        }
    }
    //得到链表的长度
    public int size(){
        int count =0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //遍历链表
    public  void display() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }
    //清空链表
    public void clear() {
        this.head = null;
    }

    //3.任意位置插入，第一个数据节点为0号下标
    public void addIndex (int index , int data) {
        if(!checkIndex(index)) {
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == this.size()) {
            addLast(data);
            return;
        }
        Node current = searchPrev(index);
        //current此时保存的是index-1 位置的节点的引用
        Node node = new Node(data);

        node.next = current.next;
        current.next = node;
    }
    /**
     * 查找index-1位置，找到返回引用
     * @param index
     * @return
     */
    public Node searchPrev(int index) {
        Node current = head;
        int count =0;
        while (count <index-1) {
            current = current.next;
            count++;
        }
        return current;
    }
    /**
     * 检查输入的下标是否合法
     * @param index
     * @return
     */
    private boolean checkIndex(int index) {
        if(index < 0 || index > this.size()) {
            System.out.println("下标不合法");
            return false;
        }
        return true;
    }

    //4.查找包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node current = head;
        //本质是遍历链表找到相等的就返回
        while (current != null) {
            if(current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    //5.删除第一次出现关键字为key的节点
    public  void remove(int key) {
        if(this.head == null) {
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node current= searchPrevNode(key);
        if(current == null) {
            System.out.println("没有你要删除的数字！");
            return;
        }
        Node del = current.next;//del 代表要删除的节点
        current.next = del.next;
    }
    /**
     * 找到要删除的节点的前驱节点
     * @param key
     * @return
     */
    private Node searchPrevNode(int key) {
        Node current = this.head;
        while (current.next != null) {
            if(current.next.data == key) {
                return current;//找到了
            }
            current = current.next;
        }
        return null;//没找到
    }


    //6.删除所有值为key的节点
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
