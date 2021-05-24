/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-05-24
 * Time 16:46
 */
public class Test2 {


    public static void main(String[] args) {
        Object o1 = true ? new Integer(1):new Double(2.0);
        Object o2;
        if (true){
            o2 = new Integer(1);
        }else {
            o2 = new Double(2.0);
        }
        System.out.println(o1);
        System.out.println(o2);
    }
}
