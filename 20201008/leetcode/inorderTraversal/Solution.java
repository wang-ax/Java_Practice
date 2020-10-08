package leetcode.inorderTraversal;
import java.util.List;
import java.util.ArrayList;
/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-08
 * Time 22:22
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null) {
            List<Integer> leftSubTreeList = inorderTraversal(root.left);
            list.addAll(leftSubTreeList);
            list.add(root.val);
            List<Integer> rightSubTreeList = inorderTraversal(root.right);
            list.addAll(rightSubTreeList);
        }
        return list;
    }
}
