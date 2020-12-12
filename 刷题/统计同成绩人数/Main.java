package day16.统计同成绩人数;

import java.util.Scanner;

/**
 * ClassName day16
 * Description TODO 统计同成绩学生人数
 * Author 30712
 * Date 2020-12-12
 * Time 9:32
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){//循环输入
            int N = Integer.parseInt(scanner.nextLine());//学生人数
            String[] strings = scanner.nextLine().split(" ");//每个学生的成绩
            int score =Integer.parseInt(scanner.nextLine());//指定的要查找的成绩
            /*System.out.println(N);
            System.out.println(Arrays.toString(strings));
            System.out.println(score);*/
            if(N == 0){
                break;//如果N是0就直接退出
            }
            int[] array = new int[strings.length];//定义一个整形的数组来存储成绩
            int count =0;//指定成绩出现的次数
            for(int i =0;i<strings.length;i++){//遍历
                array[i] = Integer.parseInt(strings[i]);
                if(array[i] == score){//遇到成绩和指定的成绩相同，count++
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
