package test3;

/**
 * ClassName test3
 * Description TODO
 * Author 30712
 * Date 2020-12-20
 * Time 14:48
 */
public class SynchronizedTest {
    private  static int COUNT =0;
    public static  void increment(){
        COUNT++;
    }
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (SynchronizedTest.class) {
                    increment();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });
    }
}
