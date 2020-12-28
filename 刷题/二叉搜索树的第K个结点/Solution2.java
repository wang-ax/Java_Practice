import java.util.ArrayList;

/**
 * ClassName PACKAGE_NAME
 * Description TODO 二叉搜索树的第K个结点
 * Author 30712
 * Date 2020-12-28
 * Time 13:17
 */
public class Solution2 {
    ArrayList<TreeNode> list = new ArrayList<>();//保存二叉树中序遍历的结果
    TreeNode KthNode(TreeNode pRoot, int k)
    {

        //二叉搜索树的中序遍历是有序的
        inorderTraversal(pRoot);
        if( k >= 1 && list.size()>=k){
            return list.get(k-1);
        }
        return null;
    }
    //中序遍历
    private    void inorderTraversal(TreeNode root) {
        if (root != null){
            inorderTraversal(root.left);
            list.add(root);
            inorderTraversal(root.right);
        }
    }
}
