package leetcode.copy_list_with_random_pointer;

public class TestCase {
    public static void main(String[] args) {
        Node n1 = new Node(0);
        Node n2 = new Node(1);
        Node n3 = new Node(2);

        n1.next = n2;
        n2.next = n3;

        n2.random = n1;

        Solution solution = new Solution();
        Node node = solution.copyRandomList(n1);

        Node current = node;
        while (current != null) {
            System.out.print(current.val);
            System.out.print(", ");
            if (current.random == null) {
                System.out.println("null");
            } else {
                System.out.println(current.random.val);
            }
            current = current.next;
        }
    }
}
