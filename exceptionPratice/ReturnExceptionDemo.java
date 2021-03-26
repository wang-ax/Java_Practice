package exceptionPratice;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-26
 * Time 19:15
 */
public class ReturnExceptionDemo {
    static  void methodA(){
        try{
            System.out.println("进入方法A");
            //要先执行finally
            throw new RuntimeException("制造异常");
        }finally {
            System.out.println("用A的方法的finally");
        }
    }
    static void methodB(){
        try{
            System.out.println("进入方法B");
            return;
        }finally {
            System.out.println("调用方法B的finally");
        }
    }

    public static void main(String[] args) {
        try{
            methodA();
        }catch (Exception e){
            //打印异常的内容
            System.out.println(e.getMessage());
        }
        methodB();
    }
}
