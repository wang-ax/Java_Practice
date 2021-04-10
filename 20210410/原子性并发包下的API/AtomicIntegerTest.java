package 原子性并发包下的API;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ClassName 原子性并发包下的API
 * Description TODO 使用原子性并发包下的API满足效率和安全
 * Author 30712
 * Date 2021-04-10
 * Time 10:44
 */
public class AtomicIntegerTest {
    private static AtomicInteger ac = new AtomicInteger();
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        ac.incrementAndGet();
                    }
                }
            }).start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(ac.get());
    }
}
