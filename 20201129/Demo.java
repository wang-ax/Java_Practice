package day6;

/**
 * ClassName day6
 * Description TODO
 * Author 30712
 * Date 2020-11-29
 * Time 19:09
 */
public class Demo {
    public static void main(String[] args) {
        boolean b = true ? false :true== true ? false:true;
        System.out.println(b);

        int num =10;
        System.out.println(test(num));
    }
    public static int test(int b) {
        try {
            b+=10;
            return b;
        } catch (RuntimeException e) {
            }
        catch (Exception e2) {

        }finally {
            b+=10;
            return b;
        }
    }
}

