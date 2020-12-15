/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-13
 * Time 15:24
 */
public class InnerClass {

    public static void main(String[] args) {//主线程（Java级别的主线程）
        //匿名内部类，重新定义了一个A的子类，子类重写了方法
        A  a = new A(){
            @Override
            public void x(){
                System.out.println("Y");
            }//只是做了类的定义
        };
        //需要明确的调用，才会执行方法
        a.x();

    }

    //静态内部类：和普通eider使用没有什么区别，只是需要明确是哪个类的 内部类
    //静态内部类，需要明确指明是哪个类的内部类。
    //其他包使用：InnerClass.A
    private static class A{
        public void x(){
            System.out.println("A");
        }
    }
}
