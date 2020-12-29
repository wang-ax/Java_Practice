package test5;

/**
 * ClassName test5
 * Description TODO
 * Author 30712
 * Date 2020-12-29
 * Time 12:48
 */
public class BreadShop1 {
    private static  int COUNT;//表示库存数
    //生产者
    public static  class  Producer implements  Runnable{
        @Override
        public void run() {
            try {
                while (true){
                    synchronized (BreadShop1.class) {
                        if (COUNT + 3 > 100){
                            BreadShop1.class.wait();//释放对象锁
                        }else{
                            System.out.println("生产者生产了3个面包");
                            COUNT = COUNT +3;
                            BreadShop1.class.notifyAll();
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费者
    public static class Consumer implements  Runnable{
        @Override
        public void run() {
            try {
                while (true){
                    synchronized (BreadShop1.class) {
                        if (COUNT == 0){
                            BreadShop1.class.wait();
                        }else{
                            System.out.println("消费者消费了一个面包");
                            COUNT--;
                            BreadShop1.class.notifyAll();//唤醒进入阻塞队列的线程
                            Thread.sleep(100);
                        }
                        Thread.sleep(100);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //消费者
        Thread[] threads = new Thread[20];
        for (int i =0;i< 20;i++){
            threads[i] = new Thread(new Consumer());
        }
        for (Thread thread : threads){
            thread.start();
        }
        //生产者
        Thread[] threads1 = new Thread[10];
        for (int i =0;i< 10;i++){
            threads1[i] = new Thread(new Producer());
        }
        for (Thread thread : threads1){
            thread.start();
        }
    }
}
