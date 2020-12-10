package day14.组个最小数;

import java.util.Scanner;

/**
 * ClassName day14
 * Description TODO 输入的数字表示拥有数字0-9的个数
 * Author 30712
 * Date 2020-12-09
 * Time 23:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] array = new int[10];
            for(int i = 0;i<10;i++){
                int n = scanner.nextInt();
                array[i] = n;
                //array[0]表示拥有0的个数
            }
            //先输出的是除了0之外最小的数
            for (int i =1;i<10;i++){
                if(array[i] >0){
                    System.out.print(i);
                    break;
                }
            }
           /* for (int i=1;i<10;i++){
                if(array[i] > 0){
                    System.out.print(i);
                    array[i]--;
                    break;
                }
            }*/
            //再将其他的数按照大小顺序输出
            for(int i =0;i<10;i++){
                //按照顺序输出
                for (int j =0;j<array[i];j++) {
                    System.out.print(i);
                }
            }
        }
    }
}
