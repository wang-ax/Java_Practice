package day16.洗牌;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName day16.洗牌
 * Description TODO
 * Author 30712
 * Date 2020-12-12
 * Time 9:47
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int T = scanner.nextInt();//共有几组数据
            while (T!=0) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] array = new int[2 * n];
                for (int i =0;i<array.length;i++){
                    array[i] = scanner.nextInt();
                }
                //实现洗牌的过程
                for(int i =0;i<k;i++) {
                    Shuffle(array, 2 * n);
                }
                //将得到的数组输出
                for (int i = 0;i<array.length;i++){
                        System.out.print(array[i] + " ");
                }
            }
            T--;
        }
    }

    private static void Shuffle(int[] array,int n) {
        //洗牌的过程
        //使用栈，将取出来的元素放入栈中然后再出栈，放入数组中
        List<Integer> list  = new ArrayList<>();
        //int[] newArray = new int[array.length];
        int middleIndex = n/2;
            for (int i = 0; i < middleIndex; i++) {
                list.add(array[i]);
                list.add(array[i + n / 2]);
            }
            for (int i = 0; i < n; i++) {
                array[i] = list.get(i);
            }
    }
}
