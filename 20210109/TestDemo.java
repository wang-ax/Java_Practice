/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 10:33
 */
public class TestDemo{
    private int count;
    public static void main(String[] args) {
        TestDemo test=new TestDemo(88);
        System.out.println(test.count);
    }
    TestDemo(int a) {
        count=a;
    }
}