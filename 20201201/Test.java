package day7;

/**
 * ClassName day7
 * Description TODO
 * Author 30712
 * Date 2020-12-01
 * Time 14:50
 */
public class Test {
    private  static int x = 100;
    //静态常量，用static修饰；既可以使用类名访问，也可以用对象访问
    public static void main(String[] args) {
        Test test1 =  new Test();
        test1.x++;

        Test test2 = new Test();
        test2.x++;

        test1 = new Test();

        test1.x++;

        Test.x--;
        System.out.println(x);
    }
}
