package 单调栈结构;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * ClassName 单调栈结构
 * Description TODO
 * Author 30712
 * Date 2021-01-31
 * Time 15:52
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i =0;i< n;i++){
                arr[i] = scanner.nextInt();
            }
            int[][] result = monotonicStack(arr);
            for (int i=0;i< n ;i++){
                System.out.println(result[i][0]+" "+result[i][1]);
            }
        }
    }

    private static int[][] monotonicStack(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[][] result = new int[arr.length][2];
        for (int i =0;i< arr.length;i++){
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]){
                int top = stack.pop();
                int leftIndex = stack.isEmpty() ? -1:stack.peek();
                result[top][0] = leftIndex;
                result[top][1] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int top = stack.pop();
            int leftIdx = stack.isEmpty() ? -1 : stack.peek();
            result[top][0] = leftIdx;
            result[top][1] = -1;
        }
        return result;
    }
}
