package serializableClone;

import java.io.Serializable;

/**
 * ClassName javaclone
 * Description TODO
 * Author 30712
 * Date 2020-12-30
 * Time 15:50
 */
public class Person implements Serializable {
    private static  final  long serialVersionUID = -9102017020286042305L;
    //姓名
    private  String name;
    private int age;
    private  Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
