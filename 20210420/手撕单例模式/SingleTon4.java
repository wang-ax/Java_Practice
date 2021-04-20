package 手撕单例模式;

/**
 * ClassName 手撕单例模式
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 11:27
 */
public class SingleTon4 {
    private static  volatile  SingleTon4 instance = null;

    public SingleTon4() {
    }

    public static SingleTon4 getInstance() {
        //双重校验锁
        if(instance == null){
            synchronized (SingleTon4.class){
                if (instance == null){
                    instance = new SingleTon4();
                }
            }
        }
        return instance;
    }
}
