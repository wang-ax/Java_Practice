package test2;

/**
 * ClassName test2
 * Description TODO
 * Author 30712
 * Date 2020-12-15
 * Time 19:32
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        //子线程休眠3秒之后，同时执行：无序执行（系统调度）
        for (int i =0;i<20;i++) {
            final int n = i;//匿名内部类使用外部的变量，必须是被final修饰的
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000);//休眠3秒
                        System.out.println(n);//随机打印0-19
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
        //main线程和子线程同时执行，并行并发的
        System.out.println("OK");//先打印OK
    }
}
