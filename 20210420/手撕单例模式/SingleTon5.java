package 手撕单例模式;

/**
 * ClassName 手撕单例模式
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 19:23
 */
public class SingleTon5 {
    public SingleTon5() {
    }
    //静态内部类
    private static  class  Holder{
        static SingleTon5 instance = new SingleTon5();
    }
    //SingleTon5类加载时，Holder类不会加载，等到第一次调用getInstance()时涉及到instance的调用才会加载instance
    public  static  SingleTon5 getInstance(){
        return Holder.instance;
    }
}
