package day32.判断二叉树是否对称;


/**
 * ClassName day32.判断二叉树是否对称
 * Description TODO
 * Author 30712
 * Date 2021-02-02
 * Time 22:42
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Main {
    /**
     *
     * @param root TreeNode类
     * @return bool布尔型
     */
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if(root == null){
            return true;
        }
        return function(root.left,root.right);
    }
    private boolean function(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        //左子树的左孩子等于右子树的右孩子，左子树的右孩子等于右子树的左孩子
        return function(left.left,right.right) && function(left.right,right.left);
    }
}
