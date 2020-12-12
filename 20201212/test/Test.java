package day17.test;

/**
 * ClassName day17.test
 * Description TODO
 * Author 30712
 * Date 2020-12-12
 * Time 11:26
 */
public class Test {
    private int count;//private修饰的成员变量，在这个类里面都可以调用
    //构造方法
    Test(){

    }
    Test(int a){
        count =a;
    }
    public  String  name = "abc";
    static  boolean Paddy;
    public static void main(String[] args) {
        Test testA = new Test();
        Test testB = new Test();
        System.out.println(testA.equals(testB));
        System.out.println(testA.name.equals(testB.name));
        Test test = new Test(88);//使用构造方法创建对象test
        System.out.println(test.count);
        System.out.println(Paddy);
    }
}
