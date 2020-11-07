package pratice;

import java.util.Scanner;

/**
 * ClassName Main11
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 17:55
 */

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] str = scanner.nextLine().split(" ");
        double[] grade = new double[n];
        double sum =0;
        double ave =0;
        for (int i = 0; i < n; i++) {
            grade[i] = Double.parseDouble(str[i]);
            sum = sum+grade[i];
        }
        ave = sum/n;
        //排序
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade.length - i - 1; j++) {
                if (grade[j] < grade[j + 1]) {
                    double tmp = grade[j];
                    grade[j] = grade[j + 1];
                    grade[j + 1] = tmp;
                }
            }
        }
        System.out.printf("%.2f %.2f %.2f",grade[0],grade[n-1],ave);
    }
}
