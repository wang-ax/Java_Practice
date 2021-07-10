package p07.p_0710;

import java.util.Objects;

/**
 * ClassName p07.p_0710
 * Description TODO
 * Author 30712
 * Date 2021-07-10
 * Time 14:30
 */
class Person{
    String name;
    public Person(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("小王");
        Person person2 = new Person("小王");
        /**
         * 没有重写equals()
         */
        System.out.println(person1 == person2);//false
        System.out.println(person1.equals(person2));//false
        // 由于没有重写equals()方法，此时这块调用的Object的equals()

        /**
         * 重写equals
         */
        System.out.println(person1.equals(person2));//true

        /**
         * String中的equals()方法是被重写过的equals()
         */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//在字符串常量池中，属于同一个对象，true
        System.out.println(s1.equals(s2));//true

        String s3 = new String("123");
        String s4 = new String("123");
        System.out.println(s3 == s4);//false
        System.out.println(s3.equals(s4));//true

        /**
         *StringBuffer中的没有重写equals，调用的是Object类的equals()方法
         * 相当于用”==”进行比较
         */
        StringBuffer c = new StringBuffer("小王");
        StringBuffer d = new StringBuffer("小王");
        System.out.println(c == d);//false
        System.out.println(c.equals(d));//false
    }
}
