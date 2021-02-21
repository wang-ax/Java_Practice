package 二叉树中为某一值的路径;


import java.util.ArrayList;

/**
 * ClassName 二叉树中为某一值的路径
 * Description TODO
 * Author 30712
 * Date 2021-02-21
 * Time 22:57
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null){
            return result;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null){
            result.add(new ArrayList<Integer>(list));
        }
        ArrayList<ArrayList<Integer>> result1 = FindPath(root.left, target);
        ArrayList<ArrayList<Integer>> result2 = FindPath(root.right, target);
        // 走到此处说明到达了叶子结点，但是该路径都没有解，所以移除最后一个结点值，栈帧回退，进入另一个递归中
        list.remove(list.size() - 1);
        return result;
    }
}
