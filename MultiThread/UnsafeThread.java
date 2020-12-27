package test3;
/**
 * ClassName test3
 * Description TODO 线程安全问题
 * Author 30712
 * Date 2020-12-20
 * Time 9:41
 */
public class UnsafeThread {
    private  volatile static  int COUNT =0;
    //一个变量COUNT=0；同时启动20个线程，每一个线程循环1000次，每次循环count++
    //main线程等待20个子线程执行完毕之后，在main线程中打印count值
    public static void main(String[] args) throws InterruptedException {
        //尽量同时启动，不让new Thread 耗时影响
        Thread[] threads = new Thread[20];
        //创建20个线程
        for (int i = 0; i < 20; i++) {
             threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j =0;j< 1000;j++){
                        COUNT++;//1.从主存读取值   2.修改  3.写回主存
                    }
                }
            });
        }
        //同时启动20个线程
        for (Thread t: threads){
            t.start();
        }
        //让main线程阻塞等待所有的20个子线程执行完毕
        for (Thread t :threads){
            t.join();
        }
        //子线程执行完毕之后再执行该打印语句
        System.out.println(COUNT);
    }
}
