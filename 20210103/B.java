/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-03
 * Time 19:09
 */
public class B {
    public static B t1 =  new B();

    public static B t2 = new B();
    {
        System.out.println("构造块");
    }
    {
        System.out.println("静态块");
    }
    public static void main(String[] args) {
        B t = new B();
    }
}
