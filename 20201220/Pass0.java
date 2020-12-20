/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-20
 * Time 16:15
 */
class Two{
    Byte x;
}
public class Pass0 {
    public static void main(String[] args) {
        Pass0 p = new Pass0();
        p.start();
    }

    private void start() {
        Two t = new Two();
        System.out.println(t.x);
        Two t2 = fix(t);
        System.out.println(t.x + " "+ t2.x);
    }

    private Two fix(Two t) {
        t.x = 42;
        return t;
    }
}
