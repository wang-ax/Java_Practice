package test4;

/**
 * ClassName test4
 * Description TODO 单例模式——多线程
 * Author 30712
 * Date 2020-12-28
 * Time 18:07
 */
public class Singleton {
    private  static volatile Singleton INSTANCE;//加上volatile保证可见性
    public Singleton() { }
    public  synchronized  static  Singleton getInstance(){
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();//非原子性的new操作
                }
            }
        }
        return INSTANCE ;
    }

    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            Singleton s =Singleton.getInstance();
        }
    }
}
