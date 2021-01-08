package test5;

/**
 * ClassName lesson5
 * Description TODO
 * Author 30712
 * Date 2020-12-29
 * Time 9:19
 */
public class SignalTest {
    public static void main(String[] args) throws InterruptedException {
        //竞争class对象锁
        synchronized (SignalTest.class ) {
            //当前线程释放对象锁，当前线程进入阻塞态
            SignalTest.class.wait();

            //通知调用同一个对象的wait()阻塞的线程（唤醒），唤醒后竞争对象锁
            SignalTest.class.notify();
        }//释放对象锁
    }
}
