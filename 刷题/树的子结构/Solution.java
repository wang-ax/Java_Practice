package 树的子结构;

/**
 * ClassName 树的子结构
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 19:13
 */
class  TreeNode{
    int val =0;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //空树不是任意一个树的子结构
        if (root1 == null || root2 == null){
            return false;
        }
        //判断root2是不是root1的子树
        if (root1.val == root2.val){
            if (judge(root1,root2)){
                return true;
            }
        }
        return HasSubtree(root1.left,root2)  || HasSubtree(root1.right,root2);
    }

    private boolean judge(TreeNode root1, TreeNode root2) {
        if (root2 == null){
            return  true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val == root2.val){
            return  judge(root1.left,root2.left) && judge(root1.right,root2.right);
        }
        return false;
    }
}
