package increasing_order_search_tree;


import java.util.ArrayList;
import java.util.List;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-18
 * Time 11:33
 */
public class Solution {
    List<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) {
            return null;
        }
        inorderTraversal(root);
        int size = list.size();
        TreeNode newRoot = new TreeNode(-1);
        TreeNode tempNode = newRoot;
        for(int i = 0;i< list.size();i++) {
            tempNode.right = new TreeNode(list.get(i));
            tempNode = tempNode.right;
        }
        return newRoot.right;
    }
    public void inorderTraversal (TreeNode root) {
        if(root == null) {
            return ;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
    }
}
