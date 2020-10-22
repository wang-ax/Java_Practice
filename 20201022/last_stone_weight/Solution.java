package leetcode.last_stone_weight;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-22
 * Time 14:45
 */
public class Solution {
    public static int LastStoneWeight(int[] stones) {
        PriorityQueue<Integer>  priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        //建大根堆
        for(int i = 0;i< stones.length;i++) {
            priorityQueue.offer(stones[i]);
        }

        while (priorityQueue.size() > 1) {
            int y = priorityQueue.poll();//堆顶元素
            int x = priorityQueue.poll();

            if(y !=x) {
                y = y-x;
                priorityQueue.offer(y);
            }
        }
        if(priorityQueue.isEmpty()) {
            return 0;
        }else {
            return priorityQueue.peek();
        }
    }
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        int res = LastStoneWeight(stones);
        System.out.println(res);
    }
}
