import java.util.Scanner;

/**
 * ClassName Main2
 * Description TODO
 * Author 30712
 * Date 2020-11-08
 * Time 19:09
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int  x = Integer.parseInt(str[0]);//矩形的长和宽
        int  y = Integer.parseInt(str[1]);
        //圆的半径
        int r = scanner.nextInt();
        //正方形的边长
        int a = scanner.nextInt();
        System.out.println(x*y);//长方形的面积
        double c = 3.14*r*r;
        //有小数位的取两位，没有的不写
        if((c * 100) % 100 > 0) {
            System.out.println((double) Math.round(c * 100) / 100);
            //Math.round(返回最近的long的说法，一个浮点值被舍入到long)
        }else{
            System.out.println((int)c);
        }

        System.out.println(a*a);//正方形的面积

    }
}
