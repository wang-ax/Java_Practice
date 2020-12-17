package test2;

/**
 * ClassName test2
 * Description TODO
 * Author 30712
 * Date 2020-12-15
 * Time 19:32
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        //thread和main同时并发并行执行，但是main线程正在运行态执行代码，很快执行后续代码
        //打印main和thread，本来应该是乱序的，但是先打印main的概率高
        Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread");
                }
            });
            thread.start();//申请系统执行线程thread，从创建态转到就绪态，由系统决定什么时候转变为运行态
            System.out.println("main");//概率比较高的是先打印main
    }
}
