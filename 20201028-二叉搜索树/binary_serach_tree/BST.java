package binary_serach_tree;

/**
 * ClassName BST
 * Description TODO
 * Author 30712
 * Date 2020-10-28
 * Time 20:02
 */
public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    //查找
    public boolean search (Integer key) {
        //定义一个current指向根结点
        Node current = root;
        //两个出口：1.找到了，退出循环
        //        2.current 为 null
        while (current != null) {
            int cmp = key.compareTo(current.key);//比较传进来的key值和目前current所指向的结点的key值
            if(cmp == 0) {
                return true;//说明找到了
            }else if(cmp < 0 ) {
                current = current.left;//去左子树找
            }else {
                current = current.right;//去右子树找
            }
        }
        return false;
    }

    //插入，非静态方法（和对象有关）
    public void insert(Integer key){
        //空树的处理
        if(root == null) {
            root = new Node(key);
            return;
        }
        //parent 为 current 的双亲结点
        Node parent = null;
        Node current = root;
        int cmp = 0;
        //先查找，没找到再插入
        while (current != null) {
            cmp = key.compareTo(current.key);
            if(cmp == 0) {//抛异常
                throw new RuntimeException("BST中不允许出现重复的值");
            }else if(cmp < 0) {
                parent = current;
                current = current.left;
            }else {
                parent = current;
                current = current.right;
            }
        }
        //到这里 current == null
        Node node = new Node(key);
        if(cmp < 0) {
            parent.left = node;
        }else {
            parent.right = node;
        }
    }
}
