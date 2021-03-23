package test;

/**
 * ClassName test
 * Description TODO
 * Author 30712
 * Date 2021-03-23
 * Time 19:03
 */
public class Child  extends  Parent{
    //静态变量
    private static  String s = "abc";
    //成员变量
    private  String o = "def";
    //静态代码块
    static {
        System.out.println("child static block");
    }
    //实例代码块
    {
        System.out.println("child block");
    }
    //构造方法
    public  Child(){
        System.out.println("child constructor");
    }
}
