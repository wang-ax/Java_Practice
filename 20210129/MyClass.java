/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-29
 * Time 19:02
 */
public class MyClass {
    long var;
    public MyClass(){
    }
    public MyClass(long var) {
        this.var = var;
    }

    public void  MyClass(long param) {
        var = param;
    }//(1)
    public static void main1(String[] args) {
        /*MyClass a, b;
        a =new MyClass();//(2)
        b =new MyClass(5);//(3)*/
    }

    public static void main(String[] args) {
        int count =0;
        int num =0;
        for (int i=0;i <=100;i++){
            num = num+i;
            count = count++;//count++,count的值一直都是0
            //count= ++count;//得到的count的值是101
        }
        System.out.println(num);
        System.out.println(count);
        System.out.println((num*count));
    }
}

