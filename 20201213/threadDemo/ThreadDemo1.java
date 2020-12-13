package threadDemo;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-13
 * Time 15:42
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //在main线程中启动了一个线程，最终main线程结束了
        Thread t = new Thread("main中的子线程1"){//设置线程的名字
            //匿名内部类
            @Override
            public void run() {
               while (true){

               }
            }
        };
        t.setDaemon(true);//设置守护线程
        //线程要启动，必须使用start方法
        t.start();//启动


        System.out.println(t.getName());//获取前面设置的名字
        System.out.println(t.getId());
        System.out.println(t.getPriority());
        System.out.println(t.getState());//状态
        System.out.println(t.isAlive());//是否存活
        System.out.println(t.isDaemon());//是不是一个守护线程
    }
}
