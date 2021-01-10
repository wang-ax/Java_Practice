/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-10
 * Time 21:30
 */
public class AddCount {
    public static  int COUNT =0;//静态变量，对COUNT 进行持续累加

    public static void main(String[] args) {
        for (int i =0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (AddCount.class){//保证安全
                        for (int j =0;j<10000;j++){
                            COUNT++;
                        }
                    }
                }
            }).start();
        }
        //等前面的累加操作执行完成之后再打印
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(COUNT);
    }
}
