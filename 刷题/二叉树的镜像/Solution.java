package 二叉树的镜像;

/**
 * ClassName 二叉树的镜像
 * Description TODO
 * Author 30712
 * Date 2020-12-29
 * Time 14:18
 */
class TreeNode{
    public int val;
    public TreeNode left;
    public  TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public void Mirror(TreeNode root) {
        //二叉树变为镜像
        if (root == null){
            return;
        }
        if(root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null){
            Mirror(root.right);
        }
        //交换
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
