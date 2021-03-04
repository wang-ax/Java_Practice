package ArrayList的实现;

/**
 * ClassName ArrayList的实现
 * Description TODO
 * Author 30712
 * Date 2021-03-04
 * Time 11:12
 */
public class ArrayList implements List{
    private int[ ] array;//顺序表内部的数组
    private  int size;//顺序表内部的元素个数

    public ArrayList() {
        array = new int[10];
        size =0;
    }

    @Override
    public boolean add(Integer e) {
        if (array.length == size){
            //扩容
        }
        array[size++] = e;
        return true;
    }

    @Override
    public void add(int index, Integer e) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int remove(int index) {//删除之后对应的数组的长度也要减
        // 合法的下标: [0 , size-1]
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }

        int e = array[index];

        // 从前往后删
        // [index + 1, size-1] 的元素，搬移到 [index, size-2] 的下标处
        for (int i = index + 1; i <= size - 1; i++) {
            array[i - 1] = array[i];
        }
        size--;
        return e;
    }

    @Override
    public boolean remove(Integer e) {
        int index = indexOf(e);
        if (index != -1) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }

        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        // 合法下标: [0, size-1]
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }

        Integer old = array[index];
        array[index] = e;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size =0;
    }

    @Override
    public boolean isEmpty() {
      return  size==0;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) != -1;
    }

    @Override
    public int indexOf(Integer e) {
        for (int i=0;i<=size-1;i++){
            if (array[i] == e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for (int i= size-1;i > 0;i--){
            if (array[i] == e){
                return i;
            }
        }
        return -1;
    }
}
