/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-11
 * Time 17:34
 */
public class HelloSogou{
    public static synchronized void main(String[] a){
        Thread t=new Thread(){
            public void run() {
                Sogou();
            }
        };
        t.run();//没有调用start方法，直接调用run方法，相当于调用普通的run方法
        System.out.print("Hello");
        //先打印Sogou 再打印Hello
    }
    static synchronized void Sogou(){
        System.out.print("Sogou");
    }
}
