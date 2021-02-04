package day34.球的半径和体积;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * ClassName day34.球的半径和体积
 * Description TODO
 * Author 30712
 * Date 2021-02-04
 * Time 18:48
 */
public class Main {
    public static void main(String[] args) {
        //输入中心点的坐标和球上某一点的坐标
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){//多组输入
            //两点式确定球的半径
            //通过半径 3/4 *Π R^3 得到球的体积
            double x0 = scanner.nextDouble();
            double y0 = scanner.nextDouble();
            double z0 = scanner.nextDouble();

            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double z1 = scanner.nextDouble();

            double r = 0;
            r = sqrt(pow((x0-x1),2)+pow((y0-y1),2)+pow((z0-z1),2));
            double volume =0;
            volume = (4*PI*r*r*r)/3;

            System.out.printf("%.3f",r);
            System.out.print(" ");
            System.out.printf("%.3f",volume);


        }
    }
}
