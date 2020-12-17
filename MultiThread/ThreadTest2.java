package test2;

/**
 * ClassName test2
 * Description TODO
 * Author 30712
 * Date 2020-12-15
 * Time 19:32
 */
public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i =0;i<20;i++) {
            final int n = i;//匿名内部类使用外部的变量，必须是被final修饰的
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                        System.out.println(n);
                }
            });
        }
        for (Thread t:threads){
            t.start();//同时启动
        }
        /**
         *
         */
        /*for (Thread t:threads){//顺序执行
            t.start();
            //t.join();//一个启动后并等待执行完之后，再启动等待执行完下一个
        }*/
        /**
         * 实际不使用该方法
         *使用yield方法，让当前的线程让步
         * 让子线程执行完之后再执行主线程的代码
         */
        /*while (Thread.activeCount()> 1){//当前线程活跃数量大于1
            //0-19随机打印出来之后，再打印OK
            Thread.yield();//让当前的线程让步从运行态转为就绪态，让main线程让步
        }*/
        /**
         * 等待一个线程：join
         * 使用join方法（标准），先将t线程执行完之后，再执行main线程
         */
        for (Thread t:threads){//同时执行20个线程，再等待所有线程执行完毕
            t.join();
        }
        System.out.println("OK");
    }
}
