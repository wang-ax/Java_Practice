package 二叉树的下一个结点;

/**
 * ClassName 二叉树的下一个结点
 * Description TODO
 * Author 30712
 * Date 2021-01-18
 * Time 21:49
 */
class TreeLinkNode{
    public int val;
    public TreeLinkNode left = null;
    public TreeLinkNode right= null;
    public TreeLinkNode next = null;

    public TreeLinkNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        //中序遍历顺序的下一个结点并且返回
        if (pNode == null){
            return null;
        }
        if (pNode.right !=null){
            //有右子树，则找右子树的最左结点
            pNode = pNode.right;
            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }
        //没有右子树，则找第一个当前结点的父结点左孩子的结点
        while (pNode.next != null){
            if (pNode.next.left == pNode){
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;//遇到了根结点仍然没有找到，则返回null
    }
}
