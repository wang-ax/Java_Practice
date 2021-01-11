import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-11
 * Time 17:29
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =scanner.nextInt();
        System.out.println(getValue(i));
    }
    public static int getValue(int  i){
        int result = 0;
        switch (i){
            case 1:
                result = result+i;
            case 2:
                result = result+i*2;
            case 3:
                result = result + i*3;
        }
        return  result;
    }
}
