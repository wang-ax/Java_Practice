package 判断是否为平衡二叉树;
/**
 * ClassName 判断是否为平衡二叉树
 * Description TODO
 * Author 30712
 * Date 2020-12-28
 * Time 12:17
 */
class TreeNode {
    public  int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
public class Solution {
    public  static  boolean isBalanced (TreeNode root) {
        // write code here
        //判断二叉树是不是平衡二叉树
        if(root == null){
            return true;
        }
        if(getHeight(root) == -1){
            return false;
        }else {
            return  true;
        }
        //任何一个节点的左右子树的高度差
        //写一个函数计算各个节点左右子树的高度差，如果有一个没有超过1，那么该树就不是平衡二叉树

    }

    private static  int getHeight(TreeNode root) {
        if(root == null){
            return 0;//空数的高度为0
        }
        int left = getHeight(root.left);
        if(left == -1){
            return -1;
        }
        int right = getHeight(root.right);
        if(right == -1){
            return -1;
        }
        if(left - right < -1 || left - right > 1){
            return -1;
        }else{
            return  Math.max(left,right) + 1;//得到的是树的高度
        }
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(root);
        System.out.println(isBalanced(root));
    }
}
