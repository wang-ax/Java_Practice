package 实现二叉树先序中序和后序遍历;


/**
 * ClassName 实现二叉树先序中序和后序遍历
 * Description TODO
 * Author 30712
 * Date 2021-01-29
 * Time 16:41
 */
class TreeNode{
    int val =0;
    public TreeNode left =null;
    public  TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    int m ,i,j;
    public  int[][] threeOrders (TreeNode root){
        int num = size(root);//二叉树的结点个数
        int[][] result = new int[3][num];

        perOrder(result[0],root);
        midOrder(result[1],root);
        postOrder(result[2],root);

        return  result;
    }

    private void perOrder(int[] a, TreeNode root) {
        if (root != null){
            a[m++] = root.val;
            perOrder(a,root.left);
            perOrder(a,root.right);
        }
    }

    private void midOrder(int[] a, TreeNode root) {
        if (root != null){
            midOrder(a,root.left);
            a[i++] = root.val;
            midOrder(a,root.right);
        }
    }

    private void postOrder(int[] a, TreeNode root) {
        if (root != null){
            postOrder(a,root.left);
            postOrder(a,root.right);
            a[j++] = root.val;
        }
    }

    private int size(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 +size(root.left)+ size(root.right);
    }
}
