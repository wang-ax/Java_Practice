package day17.火车进站;

import java.util.*;

/**
 * ClassName day17.火车进站
 * Description TODO 按字典排序  n辆火车有多少种出站的可能顺序，即数据结构中有多少种出栈的顺序
 * Author 30712
 * Date 2020-12-12
 * Time 12:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();//火车的数量
            //输入火车的编号
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            //排列组合
            int start = 0;
            ArrayList<int[]> result = new ArrayList<>();
            Permutation(array,start,n,result);
            //出栈的结果，一个元素一个记录
            Set<String> sortResult = new TreeSet<String>();
            //循环排列组合
            for (int[] out: result){
                //判断是否满足出栈要求（后进先出）
                if (isLegal(array,out,n)){
                    //满足的组合，输入结果，每一个编号用空格间隔
                    StringBuilder sb = new StringBuilder();
                    for (int i =0;i <n-1 ;i++){
                        sb.append(out[i]+" ");
                    }
                    sb.append(out[n-1]);
                    sortResult.add(sb.toString());
                }
            }
            //最后输出所有符合出栈要求的组合
            for (String list : sortResult){
                System.out.println(list);
            }
        }
        scanner.close();
    }

    /**
     *
     * @param array 火车编号数组
     * @param out 火车出栈的顺序
     * @param n 火车的数量
     * @return
     */
    private static boolean isLegal(int[] array, int[] out, int n) {
        //栈：用来存储进站的火车编号
        LinkedList<Integer> stack = new LinkedList<>();
        int i =0;
        int j =0;
        while (i < n){//array中还有元素时都需要判断
            if (array[i] == out[j]){//相等的时候不用入栈，直接后移
                i++;
                j++;
            }else{
                if (stack.isEmpty()){
                    stack.push(array[i]);
                    i++;
                }else{
                    int top = stack.peek();//栈顶元素相等，出栈
                    if (top == out[j]){
                        j++;
                        stack.poll();
                    }else if (i < n){
                        stack.push(array[i]);
                        i++;
                    }
                }
            }
        }
        while (!stack.isEmpty() && j < n){
            int top = stack.poll();
            if(top == out[j]){
                j++;
            }else {
                return  false;
            }
        }
        return true;
    }

    /**
     * 求出所有的排列
     * @param array
     * @param start
     * @param n
     * @param result
     */
    private static void Permutation(int[] array, int start, int n, ArrayList<int[]> result) {
        if (start == n){
            return;
        }
        if (start == n-1){
            int[] B = array.clone();
            result.add(B);
            return;
        }
        for (int i = start;i< n;i++){
            swap(array,start,i);
            Permutation(array,start+1,n,result);
            swap(array,start,i);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
