package 二叉树的深度;


;

/**
 * ClassName 二叉树的深度
 * Description TODO
 * Author 30712
 * Date 2020-12-29
 * Time 15:16
 */
class  Node{
    public  int val;
    public  Node left;
    public  Node right;

    public Node(int val) {
        this.val = val;
    }
}
public class Solution {
    public int TreeDepth( Node root) {
        //左子树和右子树高度的最高值+1
        if (root == null){
            return 0;
        }
        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }

}
