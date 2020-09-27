/**
 * ClassName TreeTraversal
 * Description TODO
 * Author 30712
 * Date 2020-09-26
 * Time 11:08
 */

/**
 * 对root为根的树进行遍历，遍历的对象是树不是结点
 */
public class TreeTraversal {
    //前序遍历
    public static  void preTraversal (TreeNode root){
        //前提：不是空树即存在根节点
        if(root != null) {
            //首先处理根结点
            System.out.printf("%c", root.value);
            //按照前序方式，递归处理该结点的左子树
            preTraversal(root.left);
            //按照前序方式，递归处理该结点的右子树
            preTraversal(root.right);
        }else {
            //什么都不处理
        }
    }
    //中序遍历
    public static void inTraversal(TreeNode root) {
        if(root != null) {
            inTraversal(root.left);
            System.out.printf("%c",root.value);
            inTraversal(root.right);
        }
    }
    //后序遍历
    public static void postTraversal(TreeNode root) {
        if(root != null) {
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.printf("%c",root.value);
        }
    }

    public static void main(String[] args) {

        TreeNode a =new TreeNode('A');
        TreeNode b =new TreeNode('B');
        TreeNode c =new TreeNode('C');
        TreeNode d =new TreeNode('D');
        TreeNode e =new TreeNode('E');
        TreeNode f =new TreeNode('F');
        TreeNode g =new TreeNode('G');
        TreeNode h =new TreeNode('H');
        TreeNode i =new TreeNode('I');
        TreeNode j =new TreeNode('J');

        a.left =b;
        a.right = c;
        b.left = d;
        b.right = null;
        c.left =e;
        c.right=f;
        d.left=null;
        d.right= g;
        e.left= null;
        e.right = null;
        f.left  = h;
        f.right =i;
        g.left =j;

        System.out.println("前序遍历：");
        preTraversal(a);
        System.out.println();

        System.out.println("中序遍历：");
        inTraversal(a);
        System.out.println();

        System.out.println("后序遍历：");
        postTraversal(a);
        System.out.println();

    }
}
