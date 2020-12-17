package test2;

/**
 * ClassName test2
 * Description TODO
 * Author 30712
 * Date 2020-12-15
 * Time 19:26
 */
public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        //Thread.sleep(99999);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(999999999);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();//申请系统调度之后main线程就结束了，在jconsole中只能看到t线程
        while (true){

        }
        //main线程属于Runnable状态（可执行的状态）
        //Thread线程属于TIMED_WAITING状态（限时等待状态）
    }
}
