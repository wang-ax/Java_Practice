package 二叉树的右视图;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName 二叉树的右视图
 * Description TODO
 * 给定一棵二叉树，想象自己站在它的右侧，
 * 按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * Author 30712
 * Date 2021-02-14
 * Time 12:38
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        //层序遍历，保存每一层的最后一个节点
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        //层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i=0;i< size;i++){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                if (i == size-1){
                    //将当前层的最后一个节点放入list
                    list.add(node.val);
                }
            }
        }
        return list;
    }
}
