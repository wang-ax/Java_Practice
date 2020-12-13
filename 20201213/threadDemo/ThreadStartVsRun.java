package threadDemo;

/**
 * ClassName threadDemo
 * Description TODO
 * Author 30712
 * Date 2020-12-13
 * Time 17:36
 */
public class ThreadStartVsRun {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                }
            }
        }).run();
        /**
         * main线程直接调用Thread对象的run方法，会直接在main线程中
         * 运行Thread对象的run(),即是：传入的runnable对象.run()
         * 结果：main先后曾直接运行while(true)
         */

    }
}
