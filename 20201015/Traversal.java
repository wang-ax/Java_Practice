import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void traversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) {
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();//取出队首元素
            System.out.println(node.val);
            //左孩子和右孩子放入队列
            if(node.left != null) {
                queue.add(node.left);
            }
            if(node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
