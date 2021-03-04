package ArrayList的实现;

/**
 * ClassName ArrayList的实现
 * Description TODO
 * Author 30712
 * Date 2021-03-04
 * Time 11:11
 */
//仿写真实的List（java.util.List）
public interface  List {
    //尾插
    boolean add(Integer e);
    //在指定位置进行尾插
    void add(int index,Integer e);

    //根据下标删除
    int remove(int index);
    //删除第一个遇到的
    boolean remove(Integer e);


    Integer get(int index);
    Integer set(int index,Integer e);

    int size();
    void clear();
    boolean isEmpty();

    boolean contains(Integer e);
    int indexOf(Integer e);
    int lastIndexOf(Integer e);




}
