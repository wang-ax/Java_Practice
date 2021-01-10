/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-10
 * Time 21:50
 */
public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        //同时启动20个线程
        Thread[] threads = new Thread[20];
        for (int i =0;i< 20;i++){
            final  int  n =i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(n);
                }
            });
        }
        for (Thread thread:threads){
            thread.start();
        }
        for (Thread thread : threads){
            thread.join();
        }
        System.out.println("OK");
    }
}
