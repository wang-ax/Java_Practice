package test;

/**
 * ClassName test
 * Description TODO
 * Author 30712
 * Date 2021-01-22
 * Time 16:35
 */
public class Test3 {
    public static void main(String[] args) {
        int k = f_test();
        System.out.println(k);
    }

    public static int f_test(){
        int a = 0;
        try{
            a = 1;
            return a;
        }
        finally{
            System.out.println("It is in final chunk.");
            a = 2;
           //return a;
        }
    }
}
