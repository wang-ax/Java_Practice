/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-10
 * Time 12:41
 */
public class Singleton2 {
    private static volatile  Singleton2 instance = null;
    //volatile 保证可见性，不保证原子性
    private Singleton2(){

    }
    public static  Singleton2 getInstance(){
        //双重校验锁
        if (instance == null){
            synchronized (Singleton2.class){
                if (instance == null)
                {
                    instance = new Singleton2();
                }
            }
        }
        return  instance;
    }
}
