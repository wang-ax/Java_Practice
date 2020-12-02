package day9.test;

/**
 * ClassName day9.test
 * Description TODO
 * Author 30712
 * Date 2020-12-02
 * Time 18:10
 */
public class Test2 {
   /* public static void main(String[] args) {
        String x = "fmn";
        //迷惑行为，只是调用了一下这个方法
        x.toUpperCase();//转换为大写
        System.out.println(x);//x仍然是fmn
        //f 替换成 F
        String y = x.replace('f', 'F');
        System.out.println(y);

        y = y +"wxy";
        System.out.println(y);
    }*/

    /*public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }*/

    public static void main(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i ==j);
        System.out.println(j.equals(i));

    }

}
class Person{
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person{
    String empID = "0000";

   /*自动生成的，子类的构造方法中一定要有super吗？？？
    public Employee(String nm, String empID) {
        super(nm);
        this.empID = empID;
    }*/

    public Employee(String id) {
        super(id);//子类的构造方法中要
        empID = id;
    }
}
