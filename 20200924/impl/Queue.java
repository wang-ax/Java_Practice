package impl;
import java.util.NoSuchElementException;
/**
 * ClassName Queue
 * Description TODO
 * Author 30712
 * Date 2020-09-24
 * Time 21:00
 */
//实现自己的Queue接口，是仿造真正的（java.unti.Queue）的 Queue 接口
//元素类型固定为Integer 类型，不使用泛型
public interface Queue {
    //通过特殊的返回值通知错误
   boolean offer(Integer e);
   Integer peek();
   Integer poll();

   //通过抛出异常通知错误
   default boolean add(Integer e){
       if(offer(e) == false) {
           throw new IllegalStateException();
       }
       return true;
    }
    default Integer element(){
       Integer e =peek();
       if(e == null) {
           throw new NoSuchElementException();
       }
       return e;
    }
    default Integer remove() {
       Integer e = poll();
       if(e == null) {
           throw new NoSuchElementException();
       }
       return e;
    }
}
