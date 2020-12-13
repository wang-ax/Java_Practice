/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-13
 * Time 16:51
 */
public class CreateThread {
    //创建线程的两种方法：Thread，Runnable
    public static void main(String[] args) {
        Runnable r = new Runnable() {//任务描述的可执行类，传入线程对象的构造方法
            @Override
            public void run() {//线程运行态时执行

            }
        };
        Thread thread = new Thread(r);
        thread.start();

        //代码合并
        new Thread(new Runnable() {//任务描述的可执行类，传入线程对象的构造方法
            @Override
            public void run() {//线程运行态时执行
            }
        }).start();


        //runnable只有一个接口方法，可以直接使用lambda表达式
        new Thread(() -> {
            System.out.println("使用lambda表达式");
        });
    }
}
