/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-13
 * Time 9:12
 */
//单例模式
class  Chinese{
    private  static  Chinese objref = new Chinese();

    public Chinese() {
    }
    public  static  Chinese getInstance(){
        return objref;
    }
}
public class TestChinese {
    public static void main(String[] args) {
        Chinese obj1 = Chinese.getInstance();
        Chinese obj2 = Chinese.getInstance();
        System.out.println(obj1 == obj2);//指向的是同一个对象
    }
}