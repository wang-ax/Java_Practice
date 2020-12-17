package test2;

/**
 * ClassName test2
 * Description TODO
 * Author 30712
 * Date 2020-12-15
 * Time 19:32
 */
public class JoinTest2 {
    public static void main(String[] args) throws InterruptedException {
        //thread和main同时并发并行执行，但是main线程正在运行态执行代码，很快执行后续代码
        //打印main和thread，本来应该是乱序的，但是先打印main的概率高
        Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000);//休眠3秒钟
                        System.out.println("thread");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        thread.start();//申请系统执行线程thread，从创建态转到就绪态，由系统决定什么时候转变为运行态
        thread.join();//无条件等待子线程执行完才执行，等3秒先打印thread再打印main

        //先等1秒，打印main，再等2秒，再打印t
        thread.join(1000);//当前线程（main）限时等待，直到thread执行完毕或者给定的时间已经到了，当前线程再往下执行

        //先等待thread执行完毕，系统调度thread由就绪状态转变为运行态的时间，再加上thread的运行时间
        //等3秒打印thread，之后直接打印main
       thread.join(4000);

        System.out.println("main");
    }
}
