/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-11
 * Time 10:25
 */
//继承Thread类
class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println("线程运行");
    }
}
//实现Runnable接口
class MyRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class CreateThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Thread thread2= new Thread(new MyRunnable());
        thread2.start();

        //使用匿名类创建Thread子类对象
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                System.out.println("使用匿名类创建Thread子类对象");
            }
        };
        //使用匿名类创建Runnable子类对象
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名类创建Runnable子类对象");
            }
        });
        //使用lambda表达式创建Runnable子类对象
        Thread thread5 = new Thread(()-> System.out.println("使用匿名类创建Thread子类对象"));
        Thread thread6 = new Thread(() -> {
            System.out.println("使用匿名类创建Thread子类对象");
        });
    }
}

