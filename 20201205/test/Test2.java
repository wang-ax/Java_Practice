package day12.test;

/**
 * ClassName day12.test
 * Description TODO
 * Author 30712
 * Date 2020-12-05
 * Time 14:00
 */
public class Test2 {
    public  void  add(Byte b){
         b =b++;
    }
    public void test(){
        Byte a =127;
        Byte b =127;
        add(++a);
        System.out.println(a+" ");
        add(b);
        System.out.println(b+" ");
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.test();
    }
}
