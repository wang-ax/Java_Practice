/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-06
 * Time 8:50
 */
public class MyStack {
    //利用顺序表实现
    private int[] array  = new int[100];//不考虑扩容，使用固定大小的数组
    private int size=0;

    public void push(int v){//入栈
        array[size++] = v;
    }

    public int pop(){//出栈
        return array[--size] ;
    }
    public int peek(){
        return array[size-1];//取出栈顶元素
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public int size(){
        return size;
    }
}
