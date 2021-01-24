package day23.二叉树平衡检查;

/**
 * ClassName day23.二叉树平衡检查
 * Description TODO
 * Author 30712
 * Date 2021-01-24
 * Time 18:09
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    public static boolean isBalance(TreeNode root) {
        //使用递归
        if(root == null){
            return true;//空树也是平衡二叉树
        }
        if( Math.abs(Height(root.left) - Height(root.right)) <= 1 ) {
            //满足左右子树高度差小于等于1,那就接着判断左右子树是不是平衡二叉树
            return (isBalance(root.left) && isBalance(root.right));
        } else {
            //如果已经是左右子树的高度差不等于1，那么肯定就不是平衡二叉树
            return false;
        }
    }
    //计算树的高度
    public static int Height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Height(root.left);
        int right = Height(root.right);

        return  Math.max(left,right) + 1;
    }
}
