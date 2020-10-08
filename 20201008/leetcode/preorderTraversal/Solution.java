package leetcode.preorderTraversal;
import java.util.List;
import java.util.ArrayList;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-08
 * Time 22:13
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null) {
            list.add(root.val);
            List<Integer> leftSubTreeList = preorderTraversal(root.left);
            list.addAll(leftSubTreeList);
            List<Integer> rightSubTreeList = preorderTraversal(root.right);
            list.addAll(rightSubTreeList);
        }
        return list;
    }
}
