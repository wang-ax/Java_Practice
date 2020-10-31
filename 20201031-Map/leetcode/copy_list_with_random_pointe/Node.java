package leetcode.copy_list_with_random_pointe;

/**
 * ClassName Node
 * Description TODO
 * Author 30712
 * Date 2020-10-31
 * Time 14:19
 */

/**
 * val：一个表示 Node.val 的整数。
 * random_index：随机指针指向的节点索引（范围从 0 到 n-1）；
 *               如果不指向任何节点，则为null 
 */
public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
