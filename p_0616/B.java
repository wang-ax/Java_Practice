package p_0616;

/**
 * ClassName p_0616
 * Description TODO
 * Author 30712
 * Date 2021-06-16
 * Time 9:02
 */
class A{
    public A foo(){
        return this;
    }
//    public A() {
//        System.out.println("class A");
//    }
//    {
//        System.out.println("I'm A class");
//    }
//    static {
//        System.out.println("class A static");
//    }
}
public class B extends A {
//    public B() {
//        System.out.println(" class B");
//    }
//    {
//        System.out.println(" I'm B class");
//    }
//    static {
//        System.out.println("class B static");
//    }
//
//    public static void main(String[] args) {
//        new B();
//    }

    public A foo(){
        return this;
    }
}
class C extends B {
//    public void foo(){
//
//    }
//    public int foo(){
//        return 1;
//    }
    public A foo(B b ){
        return b;
    }
//    public A foo(){
//        return A;
//    }
}
