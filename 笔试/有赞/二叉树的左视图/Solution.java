package 二叉树的左视图;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName 二叉树的左视图
 * Description TODO
 * Author 30712
 * Date 2021-08-21
 * Time 10:15
 */
class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static int[] leftSideView (TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size =queue.size();
            for (int i= 0;i<size;i++){
                TreeNode node = queue.poll();
                if (  i == 0){
                    list.add(node.val);
                }
                if (node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i= 0;i < list.size();i++){
            res[i] = list.get(i);
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
        int[] ints = leftSideView(root);
        for (int i : ints){
            System.out.println(i);
        }
    }
}
