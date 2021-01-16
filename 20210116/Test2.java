/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-16
 * Time 14:35
 */
public class Test2 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        for (int i =0;i< 3;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j =0;j < 5;j++){
                        System.out.print(j);
                    }
                    System.out.print(" ");
                }
            });
        }
        for (Thread thread:threads) {
            thread.start();
        }
    }
}
