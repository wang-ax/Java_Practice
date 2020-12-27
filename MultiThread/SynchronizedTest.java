package test3;


public class SynchronizedTest {
    private  static int COUNT =0;
    //对当前类进行加锁，线程之间同步互斥
//    public static synchronized void increment(){
//        COUNT++;
//    }

    //使用不同的对象加锁，没有同步互斥的作用：并发并行
//    public synchronized  static  void increment(){
//        COUNT++;
//        decrement();
//    }
    public synchronized  static  void decrement(){
        COUNT--;
    }

    //对this对象加锁
    public synchronized  void increment(){
        COUNT++;
    }
    public static void main(String[] args) throws InterruptedException {
        Class clazz = SynchronizedTest.class;//类对象
        SynchronizedTest st = new SynchronizedTest();
        Thread[] threads = new Thread[20];
        //同时启动20个线程
        for (int i = 0; i < 19; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        /*synchronized (clazz) {//作用在某一个对象上的
                            COUNT++;
                        }*/
                        //increment();//静态同步方法调用
                        //st.increment();//实例同步方法调用
                        synchronized (st){
                            COUNT++;
                        }
                    }
                }
            });
        }
        for (int i = 0; i < 1; i++) {
            threads[19+i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        //increment();
                        //st.increment();
                        synchronized (st){
                            COUNT++;
                        }
                    }
                }
            });
        }
        for (Thread t : threads) {
            if (t != null) {
                t.start();
            }
        }
        //让main线程阻塞等待所有的子线程执行完毕
        for (Thread t : threads) {
            if (t != null) {
                t.join();
            }
        }
        //子线程执行完毕之后再执行该打印语句
        System.out.println(COUNT);
    }
}
