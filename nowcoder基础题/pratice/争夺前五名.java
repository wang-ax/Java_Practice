package pratice;

import java.util.Scanner;

/**
 * ClassName 争夺前五名
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 17:33
 */
public class 争夺前五名 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] str = scanner.nextLine().split(" ");
        int[] grade = new int[n];
        for (int i = 0; i < n; i++) {
            grade[i] = Integer.parseInt(str[i]);
        }
        //排序
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade.length - i - 1; j++) {
                if (grade[j] < grade[j + 1]) {
                    int tmp = grade[j];
                    grade[j] = grade[j + 1];
                    grade[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(grade[i]+" ");
        }
    }
}
