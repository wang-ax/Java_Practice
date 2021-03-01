import java.util.*;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-01
 * Time 15:30
 */
class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //按照年龄升序
        return this.age-o.age;
    }
}
public class CollectionsTest {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("小王",18));
        listPerson.add(new Person("小李",20));
        listPerson.add(new Person("小张",13));
        listPerson.add(new Person("小赵",12));
        listPerson.add(new Person("小魏",21));
        System.out.println(listPerson);
        System.out.println("根据自然顺序：");
        System.out.println(Collections.min(listPerson));
        System.out.println(Collections.max(listPerson));
        System.out.println("根据指定的比较器：");
        System.out.println(Collections.min(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //按照姓名升序
                return o1.name.compareTo(o2.name);
            }
        }));
        System.out.println(Collections.max(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        }));

       /* System.out.println(listPerson);
        Collections.sort(listPerson);
        System.out.println(listPerson);
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               // return o1.age-o2.age;
                return o2.age-o1.age;
            }
        });
        System.out.println(listPerson);*/

        ArrayList<Character> list =new ArrayList<>();
        list.add('2');
        list.add('3');
        list.add('1');
        list.add('4');
        list.add('6');
        list.add('0');
        list.add('3');
        list.add('1');
        System.out.println("原来的："+list);
        /**
         * 排序：sort
         */
       /* //按自然排序的升序排序
        Collections.sort(list);
        System.out.println(list);*/
        //定制排序，由Comparator控制排序逻辑
       /* Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                //升序
                return o1.compareTo(o2);
               // return o2.compareTo(o1);  //降序
            }
        });
        System.out.println(list);*/
        /**
         * 二分查找：binarySearch
         */
        /*Collections.sort(list);
        System.out.println( Collections.binarySearch(list,'3'));
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("排序之后："+list);
        int res =  Collections.binarySearch(list, '3', new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return 0;
            }
        });
        System.out.println(res);*/

        /**
         * 反转：reverse
         */
        /*Collections.reverse(list);
        System.out.println("反转后："+list);*/
        /**
         * 随机排列：shuffle
         */
       /* Collections.shuffle(list);
        System.out.println("随机排列："+list);
        Random random = new Random();
        Collections.shuffle(list, random);
        System.out.println("指定随机源："+list);*/

        /**
         * 交换：swap
         */
        /*Collections.swap(list,2,4);
        System.out.println("交换2号和四号位置的数："+list);
        Collections.swap(list,2,2);
        System.out.println("指定位置相同："+list);*/

        /**
         * 填充：fill
         */
        /*Collections.fill(list,'5');
        System.out.println(list);*/

        /**
         * copy
         */
       /* ArrayList<Character> list1;
        list1 = new ArrayList<>(Arrays.asList(new Character[list.size()]));//初始化目标列表的容量
        Collections.copy(list1,list);
        System.out.println("复制后："+list1);

        ArrayList<Character> list2 = new ArrayList<>();
        Collections.addAll(list2,new Character[list.size()]);
        Collections.copy(list2,list);
        System.out.println("复制后："+list2);*/

        /*ArrayList<Character> list3 = new ArrayList<>();
        list3.add('3');
        list3.add('1');
        System.out.println(Collections.indexOfSubList(list,list3));
        System.out.println(Collections.lastIndexOfSubList(list,list3))*/;

       /* Collections.replaceAll(list,'1','4');
        System.out.println(list);*/

        Collections.rotate(list,3);
        System.out.println(list);
        Collections.addAll(list,new Character[]{'a','b','c'});
        System.out.println(list);
    }
}
