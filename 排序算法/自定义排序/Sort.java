package sort.自定义排序;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName sort.自定义排序
 * Description TODO
 * Author 30712
 * Date 2021-03-10
 * Time 16:43
 */
class Person{
    int age;
    String  name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Sort {
    public static void main(String[] args) {
        Person person1 = new Person(14,"王刚");
        Person person2 = new Person(17,"李四");
        Person person3 = new Person(20,"张三");
        Person[] personArray = new Person[3];
        personArray[0] = person1;
        personArray[1] = person2;
        personArray[2] = person3;

        /*Arrays.sort(personArray, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });*/
        Arrays.sort(personArray, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        for (Person person : personArray){
            System.out.println(person);
        }
    }
}
