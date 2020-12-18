/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-18
 * Time 9:17
 */
class Person implements  Cloneable{
     private String name;
     private  int age;
     
     public  Person() {

     }
     public Person(String name, int age) {
        this.name = name;
        this.age = age;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class CopyTest  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1= new Person("张三",18);
        Person p2 = (Person) p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        //如果两个对象name的地址值是相同的，说明两个对象的name都指向的是同一个String对象
        String result = p1.getName()==p2.getName() ? "clone是浅拷贝":"clone是浅拷贝";
        System.out.println(result);
        //clone操作是浅拷贝
    }
}
