package test7;

/**
 * ClassName test7
 * Description TODO
 * Author 30712
 * Date 2021-01-13
 * Time 16:14
 */

/**
 * 循环队列需要有的属性：存放元素的索引，取元素的索引，当前存放元素的数量
 */
public class MyBlockingQueue <T>{
    //使用数组实现循环队列
    private Object[] queue;
    //存放元素的索引
    private int putIndex;
    //取元素的索引
    private  int takeIndex;
    //当前存放元素的数量
    private int size;

    public MyBlockingQueue(int len){
        queue = new Object[len];
    }
    //存放元素
    //需要考虑：1.putIndex超过数组的长度
    //2.size达到数组最大长度
    public void  put(T e){
        if (size == queue.length){
            throw  new RuntimeException("超过最大长度");
        }
        queue[putIndex] = e;//存放到数组中放元素的位置
        //存放位置超过数组的最大索引，需要取模放在0位置
        putIndex = (putIndex+1)%queue.length;
        size++;
    }

    //取元素
    public T take(){
        if (size == 0){
            throw  new RuntimeException("");
        }
        T t = (T) queue[takeIndex];
        queue[takeIndex] = null;
        takeIndex = (takeIndex +1)% queue.length;
        size--;
        return t;
    }

    public  int size(){
        return size;
    }

    public static void main(String[] args) {
        MyBlockingQueue<String > queue = new MyBlockingQueue<>(10);
        for (int i =0;i<10;i++){
            queue.put(String.valueOf(i));
        }
        for (Object s:queue.queue){
            System.out.println(s);
        }
        queue.take();
        queue.put("10");
        for (Object s:queue.queue){
            System.out.println(s);
        }

        /*queue.put("A");
        queue.put("B");
        queue.put("C");
        queue.put("D");
        queue.take();
        for (Object s:queue.queue){
            System.out.println(s);
        }*/
    }
}
