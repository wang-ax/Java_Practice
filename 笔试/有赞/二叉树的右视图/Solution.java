package 二叉树的右视图;

/**
 * ClassName 二叉树的右视图
 * Description TODO
 * Author 30712
 * Date 2021-08-27
 * Time 22:15
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static int[] rightSideView (TreeNode root) {
        //二叉树的右视图
        List<Integer> list = new ArrayList<>();//用来保存结果

        Queue<TreeNode> queue = new LinkedList<>();//借助queue先进先出的特点
        queue.offer(root);//先将根结点加入到queue中
        while (!queue.isEmpty()){
            int size =queue.size();//得到queue中的节点数量，就是每一层的节点数量
            for (int i= 0;i<size;i++){
                TreeNode node = queue.poll();
                //如果是每一层的最后一个元素就加入到结果集中
                if (  i == size-1){
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
        int[] ints = rightSideView(root);
        for (int i : ints){
            System.out.println(i);
        }
    }
}

