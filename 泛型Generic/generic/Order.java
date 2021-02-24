package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * 自定义泛型类
 * Author 30712
 * Date 2021-02-24
 * Time 11:47
 */
public class Order<T>{
    String orderName;
    int orderId;
    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order(){
    }
    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }
    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }
    @Override
    public String toString() {
        return "generic.Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
    //在静态方法中不能使用类的泛型
//    public static void show(T orderT){
//        System.out.println(orderT);
//    }

    //泛型方法；在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    //泛型方法所属的类是不是泛型类都没有关系
    public static  <T>   List<T> copyFromArrayToList(T[] arr){
        ArrayList<T> list = new ArrayList<>();
        for (T t:arr){
            list.add(t);
        }
        return list;
    }
}
