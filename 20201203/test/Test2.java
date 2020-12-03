package day10.test;

/**
 * ClassName day10.test
 * Description TODO
 * Author 30712
 * Date 2020-12-03
 * Time 13:36
 */
public class Test2 {
    /*public static void opertor(StringBuffer x, StringBuffer y){
        x.append(y);
        y =x;
    }

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        opertor(a,b);
        System.out.println(a+","+b);
    }*/

    public int add(int a,int b){
        try{
            return a+b;
        }
        catch (Exception e){
            System.out.println("catch 语句块");
        }finally {
            System.out.println("finally 语句块");
        }
        return 0;
    }

    public static void main(String[] args) {
        Test2 test2  = new Test2();
        System.out.println("和是："+ test2.add(9,34));
    }
}
