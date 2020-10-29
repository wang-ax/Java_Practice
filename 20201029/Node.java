package binary_serach_tree;

/**
 * ClassName Node
 * Description TODO
 * Author 30712
 * Date 2020-10-28
 * Time 20:02
 */
public class Node {
    public Integer key;
    public Node left;
    public  Node right;

    public Node(Integer key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}
