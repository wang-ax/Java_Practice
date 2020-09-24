package impl;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * ClassName Deque
 * Description TODO
 * Author 30712
 * Date 2020-09-24
 * Time 21:02
 */
public interface Deque extends Queue {
    //通过返回特殊值
    boolean offerFirst (Integer e);
    Integer pollFirst();
    Integer peekFirst();

    boolean offerLast(Integer e);
    Integer pollLast();
    Integer peekLast();

    //通过抛出异常

    default boolean addFirst(Integer e) {
        if(offerFirst(e) == false) {
            throw  new IllegalStateException();
        }
        return true;
    }
    default Integer removeFirst() {
        Integer e = pollFirst();
        if( e == null) {
            throw  new NoSuchElementException();
        }
        return e;
    }
    default Integer getFirst() {
       Integer e = peekFirst();
       if(e == null) {
           throw new NoSuchElementException();
       }
       return  e;
    }


    default boolean addLast(Integer e) {
        if(offerFirst(e) == false) {
            throw  new IllegalStateException();
        }
        return true;
    }
    default Integer removeLast() {
        Integer e = pollFirst();
        if( e == null) {
            throw  new NoSuchElementException();
        }
        return e;
    }
    default Integer getLast() {
        Integer e = peekFirst();
        if(e == null) {
            throw new NoSuchElementException();
        }
        return  e;
    }


    //这组方法，继承自Queue
    //通过返回特殊值
    default boolean offer(Integer e) {
        return offerLast(e);
    }
    default Integer peek() {
        return peekFirst();
    }
    default Integer poll() {
        return pollFirst();
    }

    //下面这组方法为栈的形态准备，还包括上面的peek方法
    default void push(Integer e) {
        addFirst(e);
    }
    default void pop() {
        removeFirst();
    }

}
