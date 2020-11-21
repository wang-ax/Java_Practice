/**
 * ClassName PACKAGE_NAME
 * Description TODO 帮助班主任算一下有多少同学被叫家长。
 * Author 30712
 * Date 2020-11-21
 * Time 17:30
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());//n个同学
        int count =0;//被请家长的人数
        for(int i =0;i< n;i++) {
            String[] str = scanner.nextLine().split(" ");//分数依次输入
            int[] score = new int[str.length];
            int sum =0;
            //各个分数总和
            for(int j =0;j<str.length;j++) {
                score[j] = Integer.parseInt(str[j]);//字符串转为整数
                sum += score[j];
            }
            if(sum/3 < 60) {
                count++;//平均成绩小于60就会被叫家长
            }
        }
        System.out.println(count);
    }
}
