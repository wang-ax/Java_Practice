/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-27
 * Time 22:11
 */
public class Test1 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String  c = a + b;
        String  d = new String("ab");
        System.out.println((a+b).equals(c));
        System.out.println(a+b == c);
        System.out.println( c == d);
        System.out.println(c.equals(d));
    }
}
