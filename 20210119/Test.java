/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-19
 * Time 10:29
 */
public class Test {
    public static void main1(String[] args) {
        //System.out.println(-5 + 1 / 4 + 2 * -3 + 5.0);
        Thread t = new Thread(){
            public  void run(){
                dianping();
            }
        };
        t.run();
        System.out.println("dazhong");
    }
    static void dianping(){
        System.out.println("dianping");
    }

    public static void main(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
        /*b3=(b1+b2);
        System.out.println(b3+b6);*/
    }
}
