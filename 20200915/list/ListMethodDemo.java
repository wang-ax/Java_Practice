package list;
import com.sun.glass.ui.ClipboardAssistance;


import java.util.List;
import java.util.ArrayList;

/**
 * ClassName ListMethodDemo
 * Description TODO
 * Author 30712
 * Date 2020-09-15
 * Time 19:18
 */
public class ListMethodDemo {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();//建一个新的链表



        list.add("Hello");//add( E  e): 把e这个元素尾插到线性表表中
        list.add("World");
        list.add("我是");
        list.add("中国人");

        list.add(3,"吃了吗");//add(int index , E e):把e这个元素插入到index所在位置，index之后所有元素必须逻辑后移
        System.out.println(list);
        //Hello  World  我是 吃了吗 中国人


        String s =list.get(2);//get(int index) : 返回index位置的元素
        System.out.println(s);
        //我是


        list.set(4,"好的");//set(int index ,E e):用 e 替换 index 位置的元素
        System.out.println(list);
        //Hello  World  我是 吃了吗 好的


        System.out.println(list.size());//size():返回元素的个数

        list.remove("中国人");//线性表中没有 中国人  ，所以remove不起任何作用。最终list.size() 的值依然是 5
        System.out.println(list);
        System.out.println(list.size());

        //list.remove(3);//删除index这个下标的元素，index之后的元素进行逻辑后移
        System.out.println(list);

        System.out.println(list.isEmpty());//判断list是否为空，不为空，返回false
        //list.clear();//清空list
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println(list.contains("中国人"));//返回线性表中是否包含该对象
        System.out.println(list.contains("我是"));
        System.out.println(list.indexOf("我是"));//返回线性表中第一个遇到 o 这个对象的下标
        System.out.println(list.lastIndexOf("我是"));////返回线性表中最后一 个遇到 o 这个对象的下标


    }
}
