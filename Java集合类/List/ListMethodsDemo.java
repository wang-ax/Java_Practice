



import java.util.*;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-03
 * Time 8:49
 */

public class ListMethodsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("正在");
        list.add("学习");
        list.add("Java");
        System.out.println(list);

        //尾插
        list.add("OK？");
        System.out.println(list);
        //在2号下标位置插入，后续元素逻辑后移
        list.add(2,"我");
        System.out.println(list);

        //remove
        boolean remove = list.remove("OK？");//删除第一个遇到的o元素
        System.out.println(remove);
        System.out.println(list);
        //size
        System.out.println(list.size());
        //get
        System.out.println(list.get(1));
        //set
        list.set(0,"Hi");
        System.out.println(list);

        //清空线性表
       // list.clear();
        System.out.println(list);

        //判断list是否为空
        boolean listEmpty = list.isEmpty();
        System.out.println(listEmpty);

        //contains
        System.out.println(list.contains("学习"));//true
        System.out.println(list.contains("我是"));//false
        //indexOf
        System.out.println(list.indexOf("我"));//2
        //如果线性表中不存在就返回-1
        System.out.println(list.indexOf("我是"));//-1
        //lastIndexOf
        System.out.println(list.lastIndexOf("我"));//2
        System.out.println(list.lastIndexOf("我是"));//-1
        //subList
        System.out.println(list.subList(1, 4));//[World, 我, 正在]
        System.out.println(list);//截取之后，list不会发生改变

        //sort,必须传入比较器进行排序
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(6);
        list1.add(4);
        list1.add(9);
        list1.add(5);
        list1.add(2);
        System.out.println(list1);
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //隐含着自动拆箱
                //return o1.intValue()-o2.intValue();
                return o1-o2;//升序
                //return o2-o1;//降序
            }
        });
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(6);
        list2.add(4);
        System.out.println(list1.equals(list2));

        Iterator<Integer> iterator = list1 .iterator();
        while (iterator.hasNext()){//被调用6次
            System.out.println(iterator.next());//next被调用5次
        }


        List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        list3.add("D");
        //toArray
        Object[] objects = list3.toArray();
        for (Object o :objects){
           String s = (String) o;
            System.out.println(s);
        }
        //toArray(new Object[0]) 和 toArray()是相同的功能
        String[] strings = list3.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));
    }
}
