package serializableClone;

/**
 * ClassName javaclone
 * Description TODO
 * Author 30712
 * Date 2020-12-30
 * Time 15:54
 */
public class CloneTest {
    public static void main(String[] args)  {
        try {
            Person p1 = new Person("Hao LUO", 33, new Car("Benz", 300));
            Person p2 = MyUtil.clone(p1);//实现了深拷贝
            //修改了p2对象关联的汽车对象的品牌属性
            //原来的Person对象p1并没有任何影响
            //在克隆Person对象时其关联的汽车对象也被克隆了
            p2.getCar().setBrand("BYD");
            System.out.println(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
