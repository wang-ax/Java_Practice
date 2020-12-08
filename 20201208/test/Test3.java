package day13.test;

/**
 * ClassName day13.test
 * Description TODO
 * Author 30712
 * Date 2020-12-08
 * Time 13:42
 */
public class Test3 {
    public static void main(String[] args) {
        int x= 20;int y=30;
        boolean b;
        b = x>50 && y >60 ||x > 50 && y < -60
                || x < -50 && y >60 || x < -50 && y < -60;
        System.out.println(b);
    }
}
