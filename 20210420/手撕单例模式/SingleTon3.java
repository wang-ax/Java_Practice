package 手撕单例模式;

/**
 * ClassName 手撕单例模式
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 11:25
 */
public class SingleTon3 {
    //懒汉模式
    private static SingleTon3 instance = null;

    public SingleTon3() {
    }
    //线程安全
    public static SingleTon3 getInstance(){
        synchronized (SingleTon3.class){
            if (instance == null){
                instance = new SingleTon3();
            }
        }
        return instance;
    }
}
