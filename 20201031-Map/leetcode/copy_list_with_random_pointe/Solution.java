package leetcode.copy_list_with_random_pointe;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-31
 * Time 14:18
 */

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 * 要求返回这个链表的 深拷贝。
 */
public class Solution {
    public Node copyRandomList(Node head) {
        //建立映射关系
        //Node不具备比较的能力，需要传入Comparator
        Map<Node, Node> map = new TreeMap<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });

        Node newFakeNode = new Node(-1);
        Node newLast = newFakeNode;
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);
            //尾插
            newLast.next = newNode;
            newLast = newNode;

            //建立映射关系
            map.put(current, newNode);

            current = current.next;
        }

        //处理random的指向问题
        Node oldCurrent = head;
        Node newCurrent = newFakeNode.next;
        while (oldCurrent != null) {
            Node oldRandom = oldCurrent.random;

            Node newRandom;
            if(oldRandom == null) {
                newRandom = null;
            }else {
                newRandom = map.get(oldRandom);
            }
            newCurrent.random = newRandom;

            oldCurrent = oldCurrent.next;
            newCurrent = newCurrent.next;
        }
        return newFakeNode.next;
    }
}
