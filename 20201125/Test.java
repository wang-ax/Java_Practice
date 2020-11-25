/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-11-25
 * Time 14:12
 */
/*class  Person{
    private String  name = "Person";
    int age =0;
}
public class Test extends  Person {
    public String grade;
    public static void main(String[] args) {
        Person p = new Test();*/
        //name在Person中是private访问控制，只能在Person类中使用
        //System.out.println(p.name);
   // }
 /*   public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        //创建自定义异常
        if(i > 10) {
            throw new Exception("数字太大了");
        }
    }*/
//}
/*class Base{
    public Base(String  s) {
        System.out.println("B");
    }
}*/
//public class  Test extends  Base{
public class Test {
    public Test(String  s) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("C");
    }
    /*public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he" + new String ("llo");
        System.out.println(str1==str2);//==判断的是两个引用是否指向同一个对象
        //str1：在字符串常量池中
        //str2：new一个对象，会重新开辟一块内存空间，str1和str2指向的并不是同一个空间
    }*/
}
