package p07.p_0710;

import java.util.Objects;

/**
 * ClassName p07.p_0710
 * Description TODO
 * Author 30712
 * Date 2021-07-10
 * Time 16:33
 */
class Student{
   String name;
   int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class hashTest {
    public static void main(String[] args) {
        Student stu1 = new Student("xiaowang",19);
        Student stu2 = new Student("xiaowang",19);
        System.out.println("两位同学是同一个人吗？"+stu1 .equals(stu2));
        System.out.println("stu1.hashCode()="+stu1.hashCode());
        System.out.println("stu2.hahsCode()="+stu2.hashCode());
    }
}
