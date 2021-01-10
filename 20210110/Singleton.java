/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-10
 * Time 12:38
 */
public class Singleton {
    private static  Singleton instance = null;

    public Singleton() {
    }
    public synchronized static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return  instance;
    }
}
