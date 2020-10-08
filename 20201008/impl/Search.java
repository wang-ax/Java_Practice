package impl;

import sun.reflect.generics.tree.Tree;

/**
 * ClassName Search
 * Description TODO
 * Author 30712
 * Date 2020-10-08
 * Time 15:58
 */
public class Search {
    /**
     *
     *1. 空树的情况
     *2. 非空树
     *   2.1 先从根找起，找到了直接返回
     *   2.2 否则，去左子树找，找到了直接返回
     *   2.3 否则，再去右子树找
     * @param root
     * @param val
     * @return
     */
    public static boolean contains1 (TreeNode root ,int val){
        if(root == null) {
            return false;
        }
        if(root.v == val) {
            return true;
        }
        boolean leftContains = contains1(root.left,val);
        if(leftContains) {
            return true;
        }
        return contains1(root.right,val);
     }
    // 1. 在树中找到 v 了，返回第一遇到的 v 所在的结点
    // 2. 如果没找到，返回 null
    public static TreeNode contains2 (TreeNode root,int val) {
        if(root == null) {
            return null;
        }
        if(root.v == val ) {
            return root;
        }
        TreeNode leftContains = contains2(root.left,val);
        if(leftContains != null) {
            return leftContains;
        }
        return contains2(root.right ,val);
     }

    // 返回 node 是不是 以 root 为根的二叉树上的一个结点
    // 空树一律返回 false，即使找的是 null
     public static boolean contains3 (TreeNode root ,TreeNode node) {
        if(root == null) {
            return false;
        }
        if(root == node) {
            return  true;
        }
        boolean leftContains = contains3(root.left, node);
        if (leftContains) {
            return true;
        }
        return contains3(root.right, node);
     }
     public static void main(String[] args) {

        /*TreeNode root = BuildTree.buildTree();
        System.out.println(contains1(root,'A'));
        System.out.println(contains1(root,'Z'));*/

        /*TreeNode root = BuildTree.buildTree();
        TreeNode a = contains2(root,'Z');
        System.out.println(a);
        System.out.printf ("%c%n", a.v);*/ //空指针异常

        TreeNode root = BuildTree.buildTree();
        System.out.println(contains3(root,root));//true
        TreeNode a = new TreeNode('Z');
        System.out.println(contains3(root,a));// false

    }
}
