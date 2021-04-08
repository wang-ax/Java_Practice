import java.util.concurrent.TimeUnit;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-04-08
 * Time 20:59
 */
public class Test {
    public static void main(String[] args) {
        Data data = new Data();

        //线程A
        new Thread(new Runnable() {
            @Override
            public void run() {
                data.function1();
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                data.function2();
            }
        },"B").start();
    }
}
class Data{
    //synchronized修饰的是非静态的方法，所以锁的是实例对象，谁调用这个方法就锁的是哪个对象
    public synchronized  void function1(){
        //休眠3秒钟
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1...");
    }
    public synchronized  void  function2(){
        System.out.println("2...");
    }
}
