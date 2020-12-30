package serializableClone;

import java.io.*;

/**
 * ClassName javaclone
 * Description TODO 基于序列化和反序列化实现克隆：深克隆，通过泛型可以检查出要克隆的对象是否支持序列化
 * Author 30712
 * Date 2020-12-30
 * Time 15:47
 */
public class MyUtil {
    private MyUtil(){
       // throw new AssertionError();
    }
    @SuppressWarnings("unchecked")
    //clone方法，使用泛型的方式实现
    public static <T extends Serializable> T clone(T obj) throws  Exception{
         ByteArrayOutputStream bout = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(bout);
         oos.writeObject(obj);
         ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
         ObjectInputStream ois = new ObjectInputStream(bin);
         return (T) ois.readObject();
    }
}
