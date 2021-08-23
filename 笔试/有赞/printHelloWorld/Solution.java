package printHelloWorld;

/**
 * ClassName PACKAGE_NAME
 * Description TODO 打印HelloWorld
 * Author 30712
 * Date 2021-08-21
 * Time 10:10
 */
public class Solution {
    /**
     * 两个线程共用一个helloworld实例，一个hello，一个world
     * @param n
     * @return
     * @throws InterruptedException
     */
    public String helloWorld (int n) throws InterruptedException {
        // write code here

       /* StringBuilder sb = new StringBuilder();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                sb.append("hello");
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                sb.append("world");
            }
        };
        while ( n > 0){
            Thread thread1 = new Thread(runnable1);
            thread1.start();

            Thread thread2 = new Thread(runnable2);
            thread2.start();

            thread2.join();
            n--;
        }
        return sb.toString();*/

        StringBuilder stringBuilder = new StringBuilder();
        while (n  > 0){
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    stringBuilder.append("hello");
                }
            });
            thread1.start();
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    stringBuilder.append("world");
                }
            });
            thread2.start();
            thread2.join();
            n--;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        int n = 2;
        System.out.println(solution.helloWorld(n));
    }
}
