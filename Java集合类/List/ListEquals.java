import java.util.ArrayList;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 16:56
 */
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }

        if (!(obj instanceof  Person)){
            return false;
        }
        Person p = (Person) obj;
        //引用的比较使用的是equals，基本类型的比较使用的是==
        return id == p.id;
    }
}
public class ListEquals {
    public static void main(String[] args) {
        Person p1 = new Person(1,"小王");
        Person p2 = new Person(1,"小王");
        Person p3 = new Person(2,"小李");
        List<Person> list1 = new ArrayList<>();
        list1.add(p1);
        /**
         * 没有重写equals
         */
        System.out.println(list1.contains(p1));//true
        System.out.println(list1.contains(p2));//false
        System.out.println(list1.indexOf(p2));//-1
        System.out.println(list1.lastIndexOf(p2));//-1
        System.out.println(list1.contains(p3));//false


        /**
         * 重写equals后
         */
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(1,"张三");
        Person person2 = new Person(1,"李四");
        personList.add(person1);

        System.out.println(person1.equals(person2));//true
        //contains,indexOf,lastIndexOf方法本质上都使用的是equals方法进行比较
        //由于上面复写了equals,equals返回true，contains就会返回true
        //和name没有关系，由于复写的equals只比较了id，只要id相等，就会返回true
        System.out.println(personList.contains(person2));//true
        System.out.println(personList.indexOf(person2));//0
    }
}
