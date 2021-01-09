/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 14:10
 */
public class Test2 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }
    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}

