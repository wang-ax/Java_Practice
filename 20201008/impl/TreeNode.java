package impl;

/**
 * ClassName TreeNode
 * Description TODO
 * Author 30712
 * Date 2020-10-08
 * Time 15:57
 */
public class TreeNode {
    public int v;//结点的值
    public TreeNode left;//左孩子
    public TreeNode right;//右孩子

    //构造方法
    public TreeNode(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return String.format("TreeNode {%c}",v);//以字符的形式打印出来
    }
}
