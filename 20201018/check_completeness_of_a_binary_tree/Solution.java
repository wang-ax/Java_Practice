package check_completeness_of_a_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-18
 * Time 10:22
 */
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        //层序遍历的基础上，null得进入队列
        Queue<TreeNode> queue = new LinkedList<>();
        //先将根结点放入队列
        queue.add(root);
        while (true) {
            //将每个元素挨个取出来
            TreeNode node = queue.remove();
            //遇到null，跳出循环
            if(node == null) {
                break;
            }
            queue.add(node.left);
            queue.add(node.right);
        }
        //判断剩余部分是不是全为null
        //全为null。说明是完全二叉树
        //有一个不为null，就不是完全二叉树
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            //只要有一个结点不为null，就证明不是完全二叉树
            if(node != null) {
                return false;
            }
        }
        return true;
    }
}
