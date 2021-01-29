package 序列化二叉树;

/**
 * ClassName 序列化二叉树
 * Description TODO
 * Author 30712
 * Date 2021-01-29
 * Time 21:39
 */
class TreeNode{
    int val;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    String Serialize(TreeNode root) {
        //序列化
        //#表示空结点，！表示一个结点值的结束
        if(root == null){
            return "#!";
        }
        //遍历
        StringBuilder sb = new StringBuilder();
        preOrder(root,sb);
        return sb.toString();//返回的是一个字符串

    }
    void preOrder(TreeNode root ,StringBuilder sb){
        if(root == null){
            sb.append("#!");
            return;
        }
        sb.append(root.val);
        sb.append("!");
        preOrder(root.left,sb);
        preOrder(root.right,sb);

    }

    int index =-1;
    TreeNode Deserialize(String str) {
        //反序列化
        String[] strs = str.split("!");
        return  Interdeserialize(strs);
    }
    TreeNode Interdeserialize(String[] str){
        index++;
        if(!str[index].equals("#")){
            TreeNode root = new TreeNode(0);
            root.val = Integer.parseInt(str[index]);
            root.left=Interdeserialize(str);
            root.right=Interdeserialize(str);
            return root;
        }
        return null;
    }
}