/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-05-24
 * Time 16:28
 */
public class Base {
    private String  baseName= "base";

    public Base() {
        callName();
    }
    public void callName(){
        System.out.println(baseName);
    }

    static class Sub extends Base{
        private String baseName = "sub";
        public void callName(){
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        Base base = new Sub();
    }
}
