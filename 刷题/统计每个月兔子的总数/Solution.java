package day21.统计每个月兔子的总数;

import java.util.Scanner;

/**
 * ClassName 统计每个月兔子的总数
 * Description TODO
 * Author 30712
 * Date 2021-01-21
 * Time 16:22
 */
public class Solution {
    public static int getTotalCount(int monthCount){
        int total =1;
        if (monthCount == 1 || monthCount ==2){
            return total;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthCount =scanner.nextInt();
        System.out.println(getTotalCount(monthCount));
    }
}
