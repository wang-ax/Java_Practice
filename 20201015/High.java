/**
 * ClassName High
 * Description TODO
 * Author 30712
 * Date 2020-10-14
 * Time 19:19
 */
class  TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
public class High {
    public static int high(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHigh = high(root.left);
        int rightHigh = high(root.right);
        return 1+Math.max(leftHigh,rightHigh);
    }
}
