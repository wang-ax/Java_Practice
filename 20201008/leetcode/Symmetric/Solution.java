package leetcode.Symmetric;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-08
 * Time 22:49
 */
class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public boolean isMirrorTree(TreeNode p,TreeNode q) {
        if(p == null && q ==null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        return p.val == q.val && isMirrorTree(p.left,q.right) && isMirrorTree(p.right ,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isMirrorTree (root.left,root.right);
    }
}
