package day30.奇偶校验;

import java.util.Scanner;

/**
 * ClassName day30.奇偶校验
 * Description TODO
 * Author 30712
 * Date 2021-01-30
 * Time 12:33
 */
public class Main {
    //对字符串的每个字符进行奇校验，输出校验后的二进制数
    //奇校验
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            char[] chars = str.toCharArray();//字符串转为字符数组
            //对每一个字符进行奇偶校验，输出的是二进制数
            verify(chars);
        }
    }

    private static void verify(char[] chars ) {
        int[] result = new int[8];
        for (int i =0;i < chars.length;i++){
            int n = 0x01;//0000 0001
            int j =7;
            int sum =0;
            //需要进行7次的与运算，得出1的个数以及二进制形式
            while (j > 0){
                result[j] = (chars[i] & n) == 0 ? 0 : 1;
                if (result[j] == 1){//计算7位的二进制形式中1的个数，
                    sum++;
                }
                n = n<<1;
                j--;
            }
            if ((sum % 2 ) == 0){//如果1的个数为偶数
                result[0] = 1;//将第一位的数字置为1，满足奇校验
            }

            for (int k  =0;k < result.length;k++){
                System.out.println(result[k]);
            }
            result[0] = 0;
            System.out.println();
        }
    }
}
