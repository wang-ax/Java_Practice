package impl;

/**
 * ClassName BuildTree
 * Description TODO
 * Author 30712
 * Date 2020-10-08
 * Time 15:57
 */
public class BuildTree {
    public static TreeNode buildTree() {
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

        return  a;
    }
}
