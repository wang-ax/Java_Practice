package threadDemo;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-13
 * Time 16:20
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        //同时启动20个线程，每个线程从0一直+1到999
        //创建20个线程对象
        for (int i =0;i< 20;i++) {
            Thread thread = new Thread(){
                @Override
                public void run() {//多线程环境下，即使是同一个代码块，也是可以并发并行执行
                    for (int i =0;i< 1000;i++){
                        if (i == 999){
                            System.out.println(i);
                        }
                    }
                }
            };
            thread.start();
        }
       /* for (int i = 0;i < 20;i++){
            thread.start();
        }*/
    }
}
