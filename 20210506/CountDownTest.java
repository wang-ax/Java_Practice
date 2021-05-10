import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-21
 * Time 9:34
 */
public class CountDownTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore s = new Semaphore(0);
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    s.release();
                }
            }).start();
        }
        s.acquire(20);
        System.out.println("main");
    }
    public static void main1(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(20);//n初始化的值为20
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    countDownLatch.countDown();//n--
                }
            }).start();
        }
        countDownLatch.await();//阻塞等待直到n为0
        System.out.println("main");
    }
}
