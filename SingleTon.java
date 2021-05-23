package 手撕单例模式;

/**
 * ClassName 手撕单例模式
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 11:20
 */
public class SingleTon {
    //饿汉模式
    private  static SingleTon  instance = new SingleTon();

    public SingleTon() {
    }

    public static SingleTon getInstance() {
        return instance;
    }
}
