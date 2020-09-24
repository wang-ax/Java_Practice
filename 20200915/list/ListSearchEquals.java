package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ClassName ListSearchEquals
 * Description TODO
 * Author 30712
 * Date 2020-09-15
 * Time 20:17
 */
class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
//重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id ;
    }

}
public class ListSearchEquals {
    public static void main(String[] args) {
        Person p1 = new Person(1,"博哥");
        Person p2 = new Person(1,"老陈");

        List <Person> list = new ArrayList<>();
        list.add(p1);
       // list.add(p2);
        System.out.println(list.contains(p2));
        //System.out.println(list.contains(p2));
        System.out.println(list.indexOf(p2));
    }
}
