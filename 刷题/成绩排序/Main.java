package day19.成绩排序;


import java.util.*;

/**
 * ClassName day19.成绩排序
 * Description TODO
 * Author 30712
 * Date 2021-01-19
 * Time 17:46
 */
class Person{
    private String name;
    private int grade;

    public Person(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return name +" "+ grade;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            //0表示的是降序排列
            int flag = sc.nextInt();
            //添加数据
            List<Person> list = new LinkedList<>();
            for (int i= 0;i < num;i++){
                list.add(new Person(sc.next(),sc.nextInt()));
            }

            if(flag == 0) { // 降序排序
                Collections.sort(list, (Person o1, Person o2)->{
                    return o2.getGrade()-o1.getGrade();
                });
            }else{
                Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getGrade()-o2.getGrade();
                    }
                });
            }
            for (int i= 0;i < list.size();i++){
                System.out.println(list.get(i));
            }
            list.clear();
        }
    }
}
