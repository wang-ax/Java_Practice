package day32.在霍格沃茨找零钱;

import java.util.Scanner;

/**
 * ClassName day32.在霍格沃茨找零钱
 * Description TODO
 * Author 30712
 * Date 2021-02-02
 * Time 21:55
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String[] P = scanner.next().split("\\.");//应付的钱
            String[] A = scanner.next().split("\\.");//实付的钱
            //换算成最小的单位
            int PKnut = (Integer.valueOf(P[0])*17+Integer.valueOf(P[1])*29+Integer.valueOf(P[2]));
            int AKnut = (Integer.valueOf(A[0])*17+Integer.valueOf(A[1])*29+Integer.valueOf(A[2]));

            int num =AKnut-PKnut;

            //再转换回来
            int Knut = num % 29;
            int Sickle = num / 29 % 17;
            int Galleon  = num / 29 / 17;
            System.out.print(Galleon + "." + Math.abs(Sickle) + "." + Math.abs(Knut));
        }
     }
}
