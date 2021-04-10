package 原子性并发包下的API;

/**
 * ClassName lock体系
 * Description TODO
 * Author 30712
 * Date 2021-04-10
 * Time 10:35
 */
public class Test {
    private static int COUNT;
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        synchronized (Test.class) {
                            COUNT++;
                        }
                    }
                }
            }).start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(COUNT);
    }
}
