package day5;

/**
 * ClassName day5
 * Description TODO
 * Author 30712
 * Date 2020-11-27
 * Time 23:41
 */
public class Test2 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);//没有改变b
    }

    private static void operate(StringBuffer a, StringBuffer b) {
        a.append(b);
        b=a;
    }
}
