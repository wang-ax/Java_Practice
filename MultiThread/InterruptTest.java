package test2;

/**
 * ClassName test2
 * Description TODO
 * Author 30712
 * Date 2020-12-15
 * Time 21:12
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * 中断之后后面的都不会再执行
                 */
                try {
                    //获取标志位是否被中断，如果没有被中断!Thread.currentThread().isInterrupted()是true就会打印i
                    //如果中断，标识位变为true，!Thread.currentThread().isInterrupted()就为false，就会抛出异常
                    //捕获异常之后就不会继续往下执行
                    for(int i =0;i<10000 && !Thread.currentThread().isInterrupted();i++){
                        System.out.println(i);
                            //模拟中断线程
                            Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                /**
                 * 中断之后会继续执行，处理异常的形式和上面的代码不一样
                 */
                for(int i =0;i<10000 && !Thread.currentThread().isInterrupted() ;i++){
                    System.out.println(i);
                    //模拟中断线程
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();//线程启动，中断的标志位为false
        System.out.println("t start");

        //模拟，t执行了5秒，还没有结束，要中断，停止t线程
        Thread.sleep(5000);

        //如果t线程处于阻塞状态，会抛出InterruptedException异常，并且重置thread线程的标志位
        t.interrupt(); //告诉t线程，要中断（设置t线程的标志位为true），由t的代码决定是否中断

        System.out.println("t stop");
    }
}
