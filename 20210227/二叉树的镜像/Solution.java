package 二叉树的镜像;

/**
 * ClassName 二叉树的镜像
 * Description TODO
 * Author 30712
 * Date 2021-02-27
 * Time 22:15
 */
class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
}
public class Solution {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        //二叉树的镜像
        if(pRoot == null){
            return null;
        }
        //交换左右节点
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;
        //左右子树进行反转
        if(pRoot.left != null){
            Mirror(pRoot.left);
        }
        if(pRoot.right != null){
            Mirror(pRoot.right);
        }
        return pRoot;
    }
}
