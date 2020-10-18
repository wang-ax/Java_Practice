
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ClassName TestDemo
 * Description TODO
 * Author 30712
 * Date 2020-10-18
 * Time 19:54
 */
public class TestDemo {
    public static int[] getDigits(long n) {
        Deque<Integer> stack = new LinkedList<>();
        while (n > 0) {
            //先%10，再/10
            int digits = (int) n%10;
            stack.push(digits);//压栈
            n /=10;
        }
        int[] array = new int[stack.size()];
        for(int i =0 ;i < array.length;i++) {
            array[i]=stack.pop();//出栈，放入数组中
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n= scan.nextLong();
        System.out.println(Arrays.toString(getDigits(n)));
    }
}
