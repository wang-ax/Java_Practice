package binary_serach_tree;

/**
 * ClassName TreeCase
 * Description TODO
 * Author 30712
 * Date 2020-10-28
 * Time 20:54
 */
public class TreeCase {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(0);
        tree.insert(2);
        //依次查找-1 到 11
        for(int i = -1;i< 11;i++) {
            System.out.println(tree.search(i));
        }
        //在一个空树中查找7
        System.out.println(new BST().search(7));
    }
}
