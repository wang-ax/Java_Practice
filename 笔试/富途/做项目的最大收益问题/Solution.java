package 富途.做项目的最大收益问题;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * ClassName 做项目的最大收益问题
 * Description TODO
 * Author 30712
 * Date 2021-08-29
 * Time 16:55
 */
public class Solution {
    class Node{
        public int p;
        public int c;

        public Node(int p, int c) {
            this.p = p;
            this.c = c;
        }
    }
    class MinCostComparator implements Comparator<Node>{
        @Override
        public int compare(Node o1, Node o2) {
            return o1.c - o2.c;
        }
    }
    class MaxProfitComparator implements  Comparator<Node>{
        @Override
        public int compare(Node o1, Node o2) {
            return o2.p-o1.p;
        }
    }
    /**
     *
     * @param costs  每个项目的启动资金
     * @param profits 每个项目做完之后的利润
     * @param W 代表拥有的初始资金
     * @param K 代表最多可以做K个项目
     * @return 返回最后获得的最大的资金
     * 手里拥有的资金大于或等于某个项目的启动资金时才能做这个项目
     */
    public long maxMoney (int[] costs, int[] profits, int W, int K) {
        // write code here
        //小根堆，按照每个项目的最小花费构建小根堆
        PriorityQueue<Node> minCostQueue = new PriorityQueue<>(new MinCostComparator());
        //大根堆，按照每个项目的利润构建一个大根堆
        PriorityQueue<Node> maxProfitQueue = new PriorityQueue<>(new MaxProfitComparator());

        for (int i =0;i<profits.length;i++){
            minCostQueue.add(new Node(profits[i],costs[i]));
        }

        //开始做项目，每次循环代表做一个项目，只能做K个项目
        for (int i =0;i< K ;i++){
            // 取出我当前启动资金能做的所有项目(即：项目成本小于我的启动资金的项目)，放入到大根堆中
            while (!minCostQueue.isEmpty() && minCostQueue.peek().c <= W){
                maxProfitQueue.add(minCostQueue.poll());
            }
            if (maxProfitQueue.isEmpty()){
                return W;
            }
            //
            //每次挑选一个项目成本  在我的启动范围之内的并且利润最大的项目来做
            Node project = maxProfitQueue.poll();
            //项目做完之后，对应的启动资金就会增加
            W = W + project.p;
        }
        return W;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        int[] costs = new int[n];
        int[] profits = new int[n];
        scanner.nextLine();
        for (int i=0;i<n;i++){
            costs[i] = scanner.nextInt();
        }
        scanner.nextLine();
        for (int i=0;i < n;i++){
            profits[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        System.out.println(solution.maxMoney(costs, profits, w, k));
    }
}
