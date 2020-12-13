package threadDemo;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-13
 * Time 16:06
 */
public class ThreadDemo3 {
    //启动两个线程
    //main线程中new了一个线程对象（匿名内部类Thread子类重写run（））
    public static void main(String[] args) {
        Thread t = new Thread(){
            //内部类
            @Override
            public void run() {//线程进入运行态之后执行
                while (true){
                }
            }
        };
        //线程要启动，必须使用start方法
        //申请系统调度，线程由创建态到就绪态，什么时候变为运行态由系统决定
        t.start();

        while (true){//在main线程

        }
        //两个线程处于并行和并发
    }
}
