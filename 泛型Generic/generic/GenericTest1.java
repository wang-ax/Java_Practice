package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * 自定义泛型类、泛型接口
 * Author 30712
 * Date 2021-02-24
 * Time 11:50
 */
//自定义泛型类、泛型接口
public class GenericTest1 {
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //如果定义的类是带泛型的，建议在实例化时就要指明类的泛型
        /*generic.Order order = new generic.Order();
        order.setOrderT(123);
        order.setOrderT("ABC");*/

        //实例化时指明类的泛型
        Order<String > order = new Order<>("orderAA",1001,"order:AA");
        order.setOrderT("AA:hello");
    }

    public void test2(){
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型
        //所以实例化子类对象时，不再需要指明泛型
        sub1.setOrderT(1122);

        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("order2...");
    }

    public void test3(){

        ArrayList<String > list1 = null;
        ArrayList<Integer> list2 = new ArrayList<>();
        //泛型不同的引用不能相互赋值
        //list1 = list2;
    }

    //测试泛型方法
    public void test4(){
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        //泛型方法在调用时，指明泛型参数的类型
        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println(list);
    }
}
