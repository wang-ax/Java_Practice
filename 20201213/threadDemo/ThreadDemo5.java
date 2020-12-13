package threadDemo;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-13
 * Time 16:37
 */
public class ThreadDemo5 {
    //main线程执行的是new对象和调用start
    public static void main(String[] args) {
        Thread thread  = new Thread(){
            @Override
            public void run() {
               for (int i =0;i<1000;i++){
                   if (i == 20){
                       throw new RuntimeException();
                       //某个线程抛出异常，如果抛到run方法，整个线程就会终止，但是不会影响其他线程
                       //线程中处理异常的方式:
                       //线程对象.setUncaughtExceptionHandler();
                       //或者自己在run方法中捕获或者处理
                   }
                   System.out.println(i);
               }
            }
        };
        thread.start();
        while (true){
            //main线程没有结束
        }
    }
}
