package 富途.二叉树中一个节点的后续节点;

import java.util.ArrayList;
import java.util.List;

/**
 * 在二叉树中找到一个节点的后续节点
 */
class TreeNode{
    int val =0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public int nextNode (TreeNode root, int node) {
        // write code here
        //中序遍历
        List<Integer> res = inOrder(root);
        for (int i =0;i<res.size()-1;i++){
            if (node == res.get(i)){
                return res.get(i+1);
            }
        }
        return 0;
        /*int[] res = new int[list.size()];
        for (int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        for (int i=0;i<list.size();i++){
            if (node == res[i] && i < list.size()-1){
                return res[i+1];
            }
            if (node == res[list.size()-1]){
                return 0;
            }
        }
        return 0;*/
    }
    List<Integer> list = new ArrayList<>();
    private List<Integer> inOrder(TreeNode root) {

        if (root == null){
            return list;
        }
        if (root.left != null){
            inOrder(root.left);
        }
        list.add(root.val);
        if (root.right != null){
            inOrder(root.right);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(6);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2= new TreeNode(8);
        TreeNode node3= new TreeNode(2);
        TreeNode node4= new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
//        List<Integer> list = s.inOrder(root);
//        for (Integer i : list){
//            System.out.println(i);
//        }
        System.out.println(s.nextNode(root, 6));

    }
}
