package day12;

import java.util.Arrays;
import java.util.Stack;

/**
 * ClassName day12
 * Description TODO 不使用临时变量，交换数组中的两个值
 * Author 30712
 * Date 2020-12-05
 * Time 14:13
 */
public class Exchange {
    public  static  int[] exchange(int[] AB){
        //使用栈，先进后出的思想
        Stack<Integer> stack = new Stack<>();
        for(int i : AB){
            stack.add(i);//进栈
        }
        for (int i = 0;i<AB.length;i++){
            AB[i] = stack.pop();
        }
        return  AB;
    }
    public static void main(String[] args) {
        int[] AB = {1,2};
        System.out.println(Arrays.toString(exchange(AB)));
    }
}
