package day10.test;

/**
 * ClassName day10.test
 * Description TODO
 * Author 30712
 * Date 2020-12-03
 * Time 13:40
 */
public class ZeroTest {
    public static void main(String[] args) {
        try {
            int i = 100/0;
            System.out.println(i);
        }catch (Exception e){
            System.out.println(1);
            throw new RuntimeException();
        }finally {
            System.out.println(2);
        }
        System.out.println(3);
    }
}
