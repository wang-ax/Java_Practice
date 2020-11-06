package 自定义哈希表;

/**
 * ClassName MyHashTable
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 19:51
 */

/**
 * //元素类型使用Integer
 * 使用拉链法解决冲突
 */
public class MyHashTable {
    //数组中保存的是节点
    private  Node[] array = new Node[11];
    private  int size;//维护哈希表中元素的个数

    //1.插入
    // true: key 之前不在哈希表中
    // false: key 之前已经在哈希表中
    public boolean insert(Integer key) {
        // 1. 把对象转成 int 类型
        // hashCode() 方法的调用是核心
        int hashValue = key.hashCode();
        // 2. 把 hashValue 转成合法的下标
        int index = hashValue % array.length;
        // 3. 遍历 index 位置处的链表，确定 key 在不在元素中
        Node current = array[index];
        while (current != null) {
            // equals() 方法的调用是核心
            if (key.equals(current.key)) {
                return false;
            }
            current = current.next;
        }
        // 4. 把 key 装入节点中，并插入到对应的链表中
        // 头插尾插都可以，头插相对简单
        Node node = new Node(key);
        node.next = array[index];
        array[index] = node;

        // 5. 维护 元素个数
        size++;
        //6.通过维护负载因子，进行扩容
        if(size/array.length*100 >= 75) {
            扩容();
        }
        return true;
    }

    private void 扩容() {
        Node[] newArray = new Node[array.length*2];
        //不能直接按链表搬运
        //遍历整个数组
        for(int i =0;i<array.length;i++) {
            //遍历链表
            Node current = array[i];
            while (current != null) {

                Integer key = current.key;
                int hashValue = key.hashCode();
                int index = hashValue % newArray.length;

                Node node = new Node(key);
                node.next = newArray[index];
                newArray[index] = node;

                current = current.next;
            }
        }
       array =newArray;
    }

    //查找
    public boolean contains(Integer key) {
        int hashValue = key.hashCode();
        int index = hashValue % array.length;
        //遍历
        Node current = array[index];
        while (current != null) {
            if(key.equals(current.key)) {
                return true;
            }
            current =current.next;
        }
        return false;
    }

    //删除
    public boolean remove(Integer key)  {
        int hashValue = key.hashCode();

        int index = hashValue % array.length;

        Node current = array[index];
        Node prev = null;

        while (current != null) {
            if(key.equals(current.key)) {//对象的比较要用equals
                //要考虑prev为空的情况，current是链表的头节点
                if(prev == null) {
                    array[index] = current.next;
                }else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current =current.next;
        }
        return false;
    }
}
