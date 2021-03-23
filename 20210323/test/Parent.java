package test;

/**
 * ClassName test
 * Description TODO
 * Author 30712
 * Date 2021-03-23
 * Time 19:00
 */
public class Parent {
    //静态变量
    private static  String s = "abc";
    //成员变量
    private  String o = "def";
    //静态代码块
    static {
        System.out.println("parent static block");//类加载的时候执行
    }
    {
        System.out.println("parent block");
    }
    //构造方法
    public  Parent(){
        System.out.println("parent constructor");
    }
}
