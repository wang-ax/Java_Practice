package 对称二叉树;



/**
 * ClassName 对称二叉树
 * Description TODO
 * Author 30712
 * Date 2021-01-18
 * Time 22:18
 */
class TreeNode{
    public int val;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    //递归实现
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null){
            return true;
        }
        return comRoot(pRoot.left,pRoot.right);
    }

    private boolean comRoot(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        if (left == null|| right == null){
            return false;
        }
        if (left.val == right.val){
            return comRoot(left.left,right.right)&&comRoot(left.right,right.left);
        }
        return false;
    }
}
