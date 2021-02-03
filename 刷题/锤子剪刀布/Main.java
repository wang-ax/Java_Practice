package day33.锤子剪刀布;

import java.util.Scanner;

/**
 * ClassName day33.锤子剪刀布
 * Description TODO
 * Author 30712
 * Date 2021-02-03
 * Time 19:18
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//双方交锋的次数
        int countA1 =0 ,countA2 =0,countA3 = 0;
        int countB1 =0,countB2 =0,countB3 = 0;
        for (int i = 0; i < n; i++) {
            String[] string = scanner.nextLine().split(" ");
            if (string[0] == string[1]){
                countA3++;
                countB3++;
            }else if (string[0] == "C" && string[1] == "J"){
                //
                countA1++;//甲赢的次数
                countB2++;//乙输的次数
            }else if(string[0] == "J" && string[1] == "B"){
                countA1++;//甲赢的次数
                countB2++;//乙输的次数
            }else if(string[0] == "C" && string[1] == "B"){
                countA1++;//甲赢的次数
                countB2++;//乙输的次数
            }else if(string[0] == "J" && string[1] == "C"){
                countB1++;
                countA2++;
            }else if(string[0] == "B" && string[1] == "C"){
                countB1++;
                countA2++;
            }else if (string[0] == "J" && string[1] == "B"){
                countB1++;
                countA2++;
            }
        }

        System.out.println(countA1+" "+countA2+" "+countA3);
        System.out.println(countB1+" "+countB2+" "+countB3);
    }
}
