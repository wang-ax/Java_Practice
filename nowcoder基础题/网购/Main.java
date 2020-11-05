package 网购;

import java.util.Scanner;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-05
 * Time 16:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        int month = scanner.nextInt();
        int date = scanner.nextInt();
        int discount = scanner.nextInt();
        if(month == 11 && date == 11) {
            price = price * 0.70;
            if(discount == 1) {
                price = price-50;
            }
        }else if(month == 12 && date ==12) {
            price = price * 0.80;
            if(discount == 1) {
                price = price-50;
            }
        }else {
            System.out.println("该日期无优惠");
        }
        if(price <= 0) {
            price = 0.00;
        }
        System.out.println(price);
    }
}
