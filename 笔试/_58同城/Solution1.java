package _58同城;

/**
 * ClassName 同城
 * Description TODO
 * Author 30712
 * Date 2021-09-11
 * Time 20:28
 */
public class Solution1 {
    public static int digitsRecursive(int num){
        int result = num;
        while (result >= 10){
            //计算各个位数之和
            result = total(result);
        }
        return result;
    }

    public static int total(int num) {
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num = num/10;
        }
        return sum ;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(digitsRecursive(num));
    }

}
