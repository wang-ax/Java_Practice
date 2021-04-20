package 手撕单例模式;

/**
 * ClassName 手撕单例模式
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 11:22
 */
public class SingleTon2 {
    //懒汉模式-单线程版本
    private static SingleTon2 instance = null;
    public SingleTon2() {
    }
//线程不安全
    public static SingleTon2 getInstance() {
        if (instance == null){
            instance = new SingleTon2();
        }
        return instance;
    }
}
