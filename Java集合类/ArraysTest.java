import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-25
 * Time 14:46
 */
class Person{
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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class ArraysTest {
    public  static void main(String[] args) {
        //asList:将数组转化成List集合，参数是T泛型，可以存放任意的Java数据类型
        List<Integer> integers = Arrays.asList(1,2,3);
        for (Integer e : integers){
            System.out.println(e);
        }
        List<Character> longs = Arrays.asList('1','2','3');
        for (Character c : longs){
            System.out.println(c);
        }

        Integer[] data = {1,2,3,4};
        List<Integer> list = Arrays.asList(data);
        list.forEach(System.out::println);

        int[] data2 = {1,2,3,4};
        //基本数据类型的数组作为参数传入
        List<int[]> list1 = Arrays.asList(data2);
        System.out.println(list1.size());
        System.out.println(Arrays.toString(list1.get(0)));

        //参数可以是byte[],char[],int[],double[],float[],long[],short[]
        int[] numbers = new int[]{1,3,5,2,4};
        Arrays.sort(numbers);
        for (int n : numbers){
            System.out.println(n);
        }

        //使用自定义比较器
        Person[]  persons = new Person[3];
        persons[0] =new Person("张三",10);
        persons[1] = new Person("李四",20);
        persons[2] = new  Person("王五",15);
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
        });
        for (Person person:persons){
            System.out.println(person);
        }

        //对指定范围内的元素进行排序
        Character[] characters = {'1','8','5','2','6'};
        //对下标[0,3)的元素进行排序
        Arrays.sort(characters,0,3);
        System.out.println(Arrays.toString(characters));

        //使用二分查找指定元素
        Integer[]  integers1 = {1,3,5,7};
        Arrays.sort(integers1);
        System.out.println(Arrays.binarySearch(integers1,1));//0
        // 此时程序会把数组看作 {1, 3, 5, 7， 9}，此时9的索引值为4，则搜索8时返回 -(4 + 1) = -5
        System.out.println(Arrays.binarySearch(integers1,10));//-5
        // 此时程序会把数组看作 {1, 2, 3, 5, 7}，此时2的索引值为1，则搜索2时返回 -(1 + 1) = -2
        System.out.println(Arrays.binarySearch(integers1,2));//-2

        //使用二分法查找指定范围内的指定元素的索引值
        Integer[] arr = {1,5,3,7,9};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,0,3,9));//-4
        //1,3,5,7,9
        //[0,3)
        System.out.println(Arrays.binarySearch(arr,0,3,5));//2


        //数组拷贝
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = Arrays.copyOf(arr1,6);
        Integer[] arr3 = Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr2));//[1, 2, 3, 4, 5, null]
        System.out.println(Arrays.toString(arr3));//[1, 2, 3]

        //将指定的数组指定的范围复制到一个新的数组中。
        //[0,3)
        Integer[] arr4 = Arrays.copyOfRange(arr1,0,3);
        System.out.println(Arrays.toString(arr4));


        //判断数组是否相等
        Integer[] array1 = {1,2,3};
        Integer[] array2 = {1,2,3};
        System.out.println(Arrays.equals(array1,array2));

        Person[]  persons2 = new Person[3];
        persons2[0] =new Person("张三",10);
        persons2[1] = new Person("李四",20);
        persons2[2] = new  Person("王五",15);
        System.out.println(persons.equals(persons2));

        //fill:替换数组元素
        String[] words = new String[]{"hello","world"};
        Arrays.fill(words,"hi");
        for (String s:words){
            System.out.println(s);
        }

        //[1,2)
        String[] string = new String[]{"I","am","a","student"};
        Arrays.fill(string,1,2,"not");
        for (String s :string){
            System.out.println(s);
        }

        int[]  array = new int[]{1,3,4,6,2,5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] array3 = new int[]{1,2,3,4};
        System.out.println(Arrays.hashCode(array));

        Integer[] integers2 = {1,2,3,4};
        List<Integer> list2 = Arrays.stream(integers2).collect(Collectors.toList());
        System.out.println(list2);
    }
}
