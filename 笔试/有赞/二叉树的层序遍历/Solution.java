package 二叉树的层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName 二叉树的层序遍历
 * Description TODO
 * Author 30712
 * Date 2021-08-27
 * Time 22:24
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static List<List<Integer>> orderSer(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0;i<size;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
       TreeNode root = new TreeNode(1);
       TreeNode node1 = new TreeNode(2);
       TreeNode node2 = new TreeNode(3);
       TreeNode node3 = new TreeNode(4);
       TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        List<List<Integer>> lists = orderSer(root);
        for (List<Integer> list : lists){
            System.out.println(list);
        }
    }
}
