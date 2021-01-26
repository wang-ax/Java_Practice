/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-26
 * Time 18:16
 */
class A{
    public int func1(int a ,int b){
        return a-b;
    }
}
class B extends  A{
    public int func1(int a ,int b){
        return a+b;
    }
}
public class Demo {
    /*int  x =1;
    int y;
    public static void main(String[] args) {
        int z =2;
        Demo d = new Demo();
        System.out.println(d.x+d.y);
    }*/
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        System.out.println(a.func1(100,50));//150
        System.out.println(b.func1(100,50));//150

        int c = 10;
        System.out.println(c++ + c--);
    }
}
