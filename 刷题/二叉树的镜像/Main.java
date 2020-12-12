package day17.二叉树的镜像;

/**
 * ClassName day17.二叉树的镜像
 * Description TODO
 * Author 30712
 * Date 2020-12-12
 * Time 12:24
 */
class Node{
    public  int value;
    public  Node left;
    public Node right;
    public Node(Node left, Node right){
        this.left = left;
        this.right = right;
    }

}
public class Main {
    public void Mirror(Node root){
        if(root == null){
            return;
        }
        if(root.left ==null || root.right == null){
            return;
        }
        //交换
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        //递归分别实现左子树和右子树
        Mirror(root.left);
        if(root.right!= null) {
            Mirror(root.right);
        }
    }
}
