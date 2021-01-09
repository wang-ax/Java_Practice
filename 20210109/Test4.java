/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 14:25
 */
public class Test4 {
    static int x=10;
    static {
        x+=5;
    }
    public static void main(String[] args)
    {
        System.out.println("x="+x);
    }
    static{
        x/=3;
    };
}
