package day13.test;

/**
 * ClassName day13
 * Description TODO
 * Author 30712
 * Date 2020-12-08
 * Time 13:34
 */
public class Test1_Thread {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                dianping();
            }
        };//new 一个Thread对象

        thread.run();

        System.out.println("dazhong");
    }
    static void dianping(){
        System.out.println("dianping");
    }
}
