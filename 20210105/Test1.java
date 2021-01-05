/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-05
 * Time 22:45
 */
public class Test1 {
//    public static void main1(String[] args) {
//        Thread thread = new Thread() {
//            public void run(){
//                pong();
//            }
//        };
//        thread.run();//直接调用的是run方法并没有启动该线程
//        //如果是执行start方法，调用完start方法之后就会执行重写的run方法
//        //main线程处于运行的状态，因此很大可能是先打印ping，再打印pong
//        System.out.println("ping");
//    }
//    //先执行静态代码块
//    static void pong(){
//        System.out.println("pong");
//    }

    public static void main2(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                pong();
            }
        });
        thread.start();
        System.out.println("ping");
    }
    static void pong(){
        System.out.println("pong");
    }

    public static void main(String[] args) {
        String  s = "祝你考出好成绩！";
        System.out.println(s.length());
    }
}
