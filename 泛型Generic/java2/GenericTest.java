package java2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName java2
 * Description TODO
 * 泛型在继承方面的体现
 * 通配符的使用
 * Author 30712
 * Date 2021-02-24
 * Time 17:16
 */
public class GenericTest {
    /**
     * 泛型在继承方面的体现
     * 类A是类B的父类，G<A> 和G<B>， 二者不具备子父类的关系，二者是并列关系
     * 类A是类B的父类,A<G> 是B<G>的父类
     */
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1= arr2;


        List<Object> list1 = null;
        List<String> list2 = null;
        //此时list1和list2不具有子父类的关系
//        list1 = list2;//编译不通过
    }

    public void test2(){
        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;

        list1 = list3;
        list2 = list3;

        List<String> list4 = new ArrayList<>();

    }

    public void  test3(){
        List<Object> list1 = null;
        List<String> list2 = null;
        List<?> list = null;
        list = list1;
        list = list2;

        print(list1);
        print(list2);

        //
        List<String > list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        list = list3;

        //添加:对于List<?>就不能向其内部添加数据
        //除了添加null之外
        list.add(null);

        //获取：允许读取数据，读取的数据类型为Object
        Object o = list.get(0);

    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    /**
     * 有限制条件的通配符的使用
     * ? extends A:G<? extends A> 可以作为G<A>和G<B>的父类的，其中B是A的子类
     * ? super A：G<? super A> 可以作为G<A>和G<B>的父类的，其中B是A的父类
     */
    public void  test4(){
        //<=
        List<? extends Person> list1 = null;
        //>=
        List<? super Person> list2 = null;

        List<Student> list3 = new ArrayList<>();
        List<Person> list4 =new ArrayList<>();
        List<Object> list5 =new ArrayList<>();

        list1 = list3;
        list1 = list4;
        //list1 = list5;

       // list2 = list3;
        list2 = list4;
        list2 = list5;

        //读取数据：
        list1 = list4;
        Person person = list1.get(0);
        //Student s = list1.get(0);//编译不通过
        list1 = list3;
        Person person1 = list1.get(1);

        list2 = list4;
        Object object = list2.get(0);

        //写数据
        //list1.add(new Student());//编译不通过
        //编译通过
        list2.add(new Person());
        list2.add(new Student());
    }
}
