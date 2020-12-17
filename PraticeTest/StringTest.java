/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-17
 * Time 21:12
 */
public class StringTest {
    public static void main(String[] args) {
        String a = new String("myString");
        String b = "myString";
        String c = "my" + "String";
        String d = c;
        System.out.println(a == b);//两个引用指向的不是同一个对象
        System.out.println(a == c);
        System.out.println(b == c);//都是在常量池
        System.out.println(b == d);//两个引用指向的是同一个对象
    }
}
