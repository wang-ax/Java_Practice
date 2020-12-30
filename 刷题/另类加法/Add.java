import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-30
 * Time 17:14
 */
public class Add {
    public static int add(int num1,int num2){
        //不使用加减乘除。只能使用位运算符
        int s, c;
        do{
            s=num1^num2;//异或操作，计算两个数的对应位
            c=(num1&num2)<<1;//计算进位，与操作完之后，结果左移一维
            num1=s;//把第一步和第二步的结果相加，直到没有进位
            num2=c;
        }
        while(num2!=0);
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(add(a, b));
    }
}
