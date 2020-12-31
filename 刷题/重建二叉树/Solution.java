package 重建二叉树;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName 重建二叉树
 * Description TODO 根据前序遍历和中序遍历重新构建二叉树
 * Author 30712
 * Date 2020-12-31
 * Time 10:26
 */
class TreeNode{
     public int val;
     public TreeNode left;
     public  TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        List<Integer> preorderList = inArrayToList(pre);
        List<Integer> inorderList = inArrayToList(in);

        return buildTreeInternal(preorderList, inorderList);
    }
    //将数组转换为List
    private List<Integer> inArrayToList (int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int e :array){
            list.add(e);
        }
        return list;
    }

    public TreeNode buildTreeInternal(List<Integer> preList, List<Integer> inList) {
        //数组转换为list，方便使用一些API
        if (preList.isEmpty()){
            return null;
        }
        //从前序遍历的序列中得到根结点的值
        int rootVal = preList.get(0);//前序遍历的第一个位置就是根结点
        TreeNode root = new TreeNode(rootVal);
        //根据根结点的值，在中序遍历的序列中找的根结点的位置
        int leftSize = inList.indexOf(rootVal);

        //得到左子树的前序和右子树的前序
        List<Integer> leftPre = preList.subList(1,1+leftSize);
        List<Integer> rightPre = preList.subList(1+leftSize,preList.size());

        //得到左子树的中序和右子树的中序
        List<Integer> leftIn = inList.subList(0,leftSize);
        List<Integer> rightIn  = inList.subList(leftSize+1,inList.size());
        //利用递归分别构建左子树和右子树
        root.left = buildTreeInternal(leftPre,leftIn);
        root.right = buildTreeInternal(rightPre,rightIn);
        return root;
    }
}
