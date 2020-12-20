package test3;
/**
 * ClassName test3
 * Description TODO 线程安全问题
 * Author 30712
 * Date 2020-12-20
 * Time 14：36
 */
public class SafeThread {
    private  static  int COUNT =0;
    //一个变量COUNT=0；同时启动20个线程，每一个线程循环1000次，每次循环count++
    //main线程等待20个子线程执行完毕之后，在main线程中打印count值
    public static void main(String[] args) throws InterruptedException {
        //Class clazz = SafeThread.class;//类对象
        Thread[] threads = new Thread[20];
        //同时启动20个线程
        for (int i = 0; i < 20; i++) {
             threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j =0;j< 1000;j++){
                        //加锁，实现安全问题
                        //synchronized同步代码块
                        synchronized (SafeThread.class) {//作用在某一个对象上的
                            COUNT++;
                        }

                    }
                }
            });
        }
        for (Thread t: threads){
            t.start();
        }
        //让main线程阻塞等待所有的子线程执行完毕
        for (Thread t :threads){
            t.join();
        }
        //子线程执行完毕之后再执行该打印语句
        System.out.println(COUNT);
    }
}
