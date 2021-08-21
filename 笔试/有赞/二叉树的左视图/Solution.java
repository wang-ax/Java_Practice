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
}
public class Solution {
    public int[] leftSideView (TreeNode root) {
        // write code here
        //从左侧能看到的节点值
        if (root == null){
            return null;
        }
        //层序遍历每一层的第一个元素
        List<Integer> result = new ArrayList<>();

//        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        temp.add(root.val);
//        list.add(root.val);
        while (!queue.isEmpty()){
           TreeNode node = queue.poll();
            if (root.left != null){
                queue.offer(root.left);
            }
            if (root.right != null){
                queue.offer(root.right);
            }
            temp.add(node.val);
            result.add(root.val);
        }
        int n = result.size();
        int[] res = new int[n];
        for (int i=0;i< n;i++){
            res[i] = result.get(i);
        }
        return res;
    }
}
