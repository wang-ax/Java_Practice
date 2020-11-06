package RealLinkedList;

/**
 * ClassName TestDemo
 * Description TODO
 * Author 30712
 * Date 2020-11-06
 * Time 11:06
 */
public class TestDemo {
    public static void main(String[] args) {
        RealLInkedList realLInkedList = new RealLInkedList();
        //尾插
        realLInkedList.addLast(1);
        realLInkedList.addLast(2);
        realLInkedList.addLast(3);
        realLInkedList.addLast(4);
        realLInkedList.addLast(2);

        //头插
        realLInkedList.addFirst(10);
        //打印链表
        realLInkedList.display();

        //查找10
        System.out.println(realLInkedList.contains(10));

        //删除1
        realLInkedList.remove(1);
        realLInkedList.display();

        //删除所有的2
        realLInkedList.removeAll(2);
        realLInkedList.display();
    }
}
