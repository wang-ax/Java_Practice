package leetcode.copy_list_with_random_pointer;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public Node copyRandomList(Node head) {
        // 1. 通过遍历老的链表，复制新的链表
        //    同时，记录一个映射关系（老的节点 -> 新的节点)

        Map<Node, Node> 老新映射 = new TreeMap<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });

        Node newFakeHead = new Node(-1);
        Node newLast = newFakeHead;

        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);

            // 尾插
            newLast.next = newNode;
            newLast = newNode;

            // 建立映射关系
            老新映射.put(current, newNode);

            current = current.next;
        }

        // 2. 专心处理 random 的指向关系
        Node oldCurrent = head;
        Node newCurrent = newFakeHead.next;
        while (oldCurrent != null) {
            Node oldRandom = oldCurrent.random;

            Node newRandom;
            if (oldRandom == null) {
                newRandom = null;
            } else {
                newRandom = 老新映射.get(oldRandom);
            }

            newCurrent.random = newRandom;

            oldCurrent = oldCurrent.next;
            newCurrent = newCurrent.next;
        }

        return newFakeHead.next;
    }
}
