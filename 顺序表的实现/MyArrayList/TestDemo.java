package MyArrayList;

/**
 * ClassName TestDemo
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 11:53
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        //add(在 pos 位置新增元素)
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.add(5,6);

        //display(打印顺序表)
        myArrayList.display();

        //删除第一次出现的关键字key
        myArrayList.remove(1);
        myArrayList.display();

        myArrayList.remove(3);
        myArrayList.display();

        myArrayList.remove(6);
        myArrayList.display();

    }


}
