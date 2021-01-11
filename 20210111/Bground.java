/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-11
 * Time 17:37
 */
public class Bground extends  Thread{
    public static void main(String[] args) {
        Bground bground = new Bground();
        bground.run();
    }
    public  void  start(){
        for (int i =0;i< 10;i++){
            System.out.println("Value of i ="+i);
        }
    }
}
