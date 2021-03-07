package 最小的K个数;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * 基于堆或者红黑树的解法
 */
public class Solution3_Best {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        if (input == null || input.length == 0 || input.length<k|| k==0){
            return list;
        }
        /**
         * PriorityQueue实现
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//由大到小进行排序
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (priorityQueue.size()< k){
                priorityQueue.offer(input[i]);
            }else if(input[i] < priorityQueue.peek()){//和堆顶的元素进行比较
                priorityQueue.poll();
                priorityQueue.offer(input[i]);
            }
        }
        for (int i =0;i<k;i++){
            list.add(priorityQueue.poll());
        }
        /**
         * TreeSet实现
         */
        TreeSet<Integer> kSet = new TreeSet<>();
        for (int i=0;i<input.length;i++){
            if (kSet.size() < k){
                kSet.add(input[i]);
            }else if(input[i] < kSet.last()){//和kSet中的最后一个元素进行比较
                    kSet.remove(kSet.last());
                    kSet.add(input[i]);
            }
        }
        for (Integer e :kSet){
            list.add(e);
        }


        return list;
    }


    public static void main(String[] args) {
        int[] array = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(array,2));
    }
}
