package 二叉树层序遍历;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName 二叉树层序遍历
 * Description TODO
 * Author 30712
 * Date 2021-02-14
 * Time 17:39
 */
class  TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

/**
 * Interface：Queue extends  Collection
 * 实现类：LinkedList
 * 除了基本的Collection队列操作，提供了额外的插入、提取、检验操作
 * 两种形式：
 * 抛异常：add(e),remove(),element()
 * 返回特殊值：offer(e),poll()[删除队首元素],peek()[查看队首元素]
 */
public class Solution {
    //每一层的结果为一个list，最终包裹在一个list中
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (root == null){
            return  list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            int levelNum = queue.size();
            for (int i=0;i< levelNum;i++){
                //peek()查看但不删除队列的头部
                if (queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                //poll()移除并返回队列的头部
                level.add(queue.poll().val);
            }
            list.add(level);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(solution.levelOrder(root));
    }
}
