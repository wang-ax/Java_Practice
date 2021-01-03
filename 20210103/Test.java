/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-03
 * Time 14:12
 */
 abstract  class Animal{
    abstract void growl();
}
public class Test {
    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        char c[] = {'h','e','l','l','o'};
        System.out.println(s.equals(t));//true
        System.out.println(t.equals(c));//false
        System.out.println(s == t);//true
        System.out.println(t.equals(new String("hello")));//true
    }
    public static void main3(String[] args) {
        int a =100,b =50,c = a---b,d = a ---b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void main2(String[] args) {
        int x,y;
        x =  5>>2 ;
        y = x >>>2;
        System.out.println(y);
    }
    public static void main1(String[] args) {
        String str = "12345a";
        int i = Integer.parseInt(str);
        //会抛异常，NumberFormatException（数字格式错误，抛出异常）
        System.out.println(i);
    }
}
