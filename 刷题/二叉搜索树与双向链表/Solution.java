package 二叉搜索树与双向链表;


/**
 * ClassName 二叉搜索树与双向链表
 * Description TODO
 * Author 30712
 * Date 2021-01-11
 * Time 20:23
 */
class  TreeNode{
    public  int val =0;
    public  TreeNode left = null;
    public  TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
//递归
//中序遍历是有序的
public class Solution {
    //定义链表当前结点
    TreeNode node = null;
    //定义链表头部的结点
    TreeNode realHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null){//根结点为null，树为空，返回null
            return  null;
        }
        Convert(pRootOfTree.left);//左子树

        if (node == null){
            node = pRootOfTree;
            realHead = pRootOfTree;
        }else {
            node.right = pRootOfTree;//当前结点的右边是根结点
            pRootOfTree.left = node;//根结点的左边是当前结点
            node = pRootOfTree;//当前结点变为根结点，继续往后
        }
        Convert(pRootOfTree.right);//再对右子树进行递归，采用相同的方式完成
        return  realHead;//返回链表的头结点就可以了
    }
}
