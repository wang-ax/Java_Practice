package 自定义类使用HashMap和HashSet;

import java.util.Objects;

/**
 * ClassName Person
 * Description TODO
 * Author 30712
 * Date 2020-11-03
 * Time 20:53
 */
public class Person {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);//属性相等，hashCode得到的值就是相等的
    }
}
