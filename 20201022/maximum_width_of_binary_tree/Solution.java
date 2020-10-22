package leetcode.maximum_width_of_binary_tree;
import java.util.LinkedList;
import java.util.Queue;
/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-22
 * Time 15:53
 */
class TreeNode {
    public int val;
    public TreeNode left;
    public  TreeNode right;
    TreeNode(int val,TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class AnnotatedNode {
    TreeNode node;
    int depth, pos;

    AnnotatedNode(TreeNode n, int d, int p) {
        node = n;
        depth = d;
        pos = p;
    }
}
public class Solution {
    public static int maxWidthOfBinaryTree(TreeNode root) {
        Queue<AnnotatedNode> queue = new LinkedList();
        queue.add(new AnnotatedNode(root, 0, 0));
        int curDepth = 0, left = 0, ans = 0;
        while (!queue.isEmpty()) {
            AnnotatedNode a = queue.poll();
            if (a.node != null) {
                queue.add(new AnnotatedNode(a.node.left, a.depth + 1, a.pos * 2));
                queue.add(new AnnotatedNode(a.node.right, a.depth + 1, a.pos * 2 + 1));
                if (curDepth != a.depth) {
                    curDepth = a.depth;
                    left = a.pos;
                }
                ans = Math.max(ans, a.pos - left + 1);
            }
        }
        return ans;
    }
    /**
     * 使用一个队列和一个LinkeList
     */
    public static int maxWidthOfBinaryTree2 (TreeNode root) {
        //空树
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();//传结点
        LinkedList<Integer> list  =new LinkedList<>();//传level

        queue.offer(root);
        list.add(0);

        int max =1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i =0;i<size;i++) {
                TreeNode current = queue.poll();
                int index = list.removeFirst();
                if(current.left != null) {
                    queue.offer(current.left);
                    list.add(index*2 +1);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                    list.add(index*2 +2);
                }
            }
            if(list.size() >= 1) {
                max = Math.max(max,list.getLast()-list.getFirst()+1);
            }
        }
        return max;
    }
}
