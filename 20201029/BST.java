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

    //删除
    public boolean remove (Integer key ) {
        //1.先查找包含key的节点，找到之后进行删除操作
        Node parent = null;
        Node current = root;
        while (current != null) {
           int cmp = key.compareTo(current.key);
                    if(cmp == 0) {
                        //找到了key，执行删除操作
                        removeInternal(current,parent);
                        return true;
                    }else if (cmp < 0){
                          parent = current;
                          current = current.left;
                    }else {
                        parent = current;
                        current = current.right;
                    }
        }
        return  false;
    }
    private void removeInternal(Node node , Node parent) {
        //情况一：要删除的结点是叶子节点
        if(node.left == null && node.right == null) {
            //node是根结点
            if(node == root) {
                root = null;
            }else if (node == parent.left){//node是其parent的左孩子，让parent的左孩子为空
                parent.left = null;
            }else {
                parent.right = null;//node是其parent的右孩子，让parent的右孩子为空
            }
        }
        //情况二：要删除的节点有一个孩子（左孩子），左孩子不为空，右孩子为空
        else if(node.left != null && node.right == null) {
            if(node == root) {
                root = node.left;//让node的左孩子为根
            }else if(node == parent.left) {
                parent.left = node.left;
            }else {
                parent.right = node.left;
            }
        }
        //情况三：要删除的节点有一个孩子（右孩子），左孩子为空，右孩子不为空
        else if (node.left == null && node.right!=null ) {
            if(node == root) {
                root = node.right;
            }else if(node == parent.left) {
                parent.left = node.right;
            }else {
                parent.right = node.right;
            }
        }
        //情况四：要删除的节点有两个孩子，替换法删除
        else {
            //1.找到左子树中最大的一个或者右子树中最小的一个，记为ghost
           Node ghostParent = node;
           Node ghost = node.left;
           while (ghost.right != null) {
               ghostParent = ghost;
               ghost = ghost.right;
           }
           //2.ghost的值和node的值交换
           node.key = ghost.key;
           //3.删除ghost节点
           if(node == ghostParent) {
               ghostParent.left = ghost.left;
           }else {
               ghostParent.right = ghost.left;
           }
        }
    }
}
