package 二叉树前序遍历;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ClassName 二叉树前序遍历
 * Description TODO
 * Author 30712
 * Date 2020-12-21
 * Time 22:20
 */

public class Solution {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
    public ArrayList<Integer> preorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return list;
        }
        //先序遍历：根左右
        //递归
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return list;
    }
}
