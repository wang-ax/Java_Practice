package 把二叉树打印成多行;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName 把二叉树打印成多行
 * Description TODO
 * Author 30712
 * Date 2021-01-20
 * Time 16:33
 */
class TreeNode{
    public int val;
    public  TreeNode right = null;
    public  TreeNode left = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        TreeNode curNode;
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> curList = new ArrayList<>();

            for (int i =0;i<size;i++){
                curNode = queue.poll();
                curList.add(curNode.val);
                if (curNode.left != null){
                    queue.offer(curNode.left);
                }
                if (curNode.right != null){
                    queue.offer(curNode.right);
                }
            }
            result.add(curList);
        }
        return result;
    }
}
