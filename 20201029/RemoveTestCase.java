package binary_serach_tree;

/**
 * ClassName RemoveTestCase
 * Description TODO
 * Author 30712
 * Date 2020-10-29
 * Time 17:20
 */
public class RemoveTestCase {
    private static void case1() {
        BST bst = new BST();
        bst.insert(5);

        System.out.println(bst.remove(3));
    }
    private static void case2() {
            BST bst = new BST();
            bst.insert(5);

            System.out.println(bst.remove(5));
    }

    private static void case3() {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);

        boolean remove = bst.remove(3);
        System.out.println(remove);
    }

    private static void case6() {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);
        boolean remove = bst.remove(3);
        System.out.println(remove);
    }

    public static void main(String[] args) {
        case1();
        case2();
        case3();
        case6();
        case11();
        case12();
        case14();

    }

    private static void case14() {
        BST bst = new BST();
        System.out.println(bst.remove(2));
    }

    private static void case12() {
        BST bst = new BST();
        bst.insert(7);
        bst.insert(8);
        bst.insert(5);
        bst.insert(6);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        boolean remove = bst.remove(5);
        System.out.println(remove);
    }

    private static void case11() {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);
        bst.insert(4);
        boolean remove = bst.remove(3);
        System.out.println(remove);
    }


}
