package day9.test;

/**
 * ClassName day9.test
 * Description TODO
 * Author 30712
 * Date 2020-12-02
 * Time 18:00
 */
public class Test {
    private  static  void testMethod(){
        System.out.println("testMethod");
    }

    public static void main(String[] args) {
        ((Test) null).testMethod();
        //程序运行正常，相当于使用类名.testMethod进行调用
    }
}
