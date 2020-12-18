/**
 * ClassName PACKAGE_NAME
 * Description TODO 深拷贝
 * Author 30712
 * Date 2020-12-18
 * Time 9:32
 */

/**
 * 要实现深拷贝一个对象，这个对象必须实现Cloneable接口，实现clone方法，
 * 并且在clone方法内部，把该对象引用的其他对象也要clone一份
 * 要求被引用的对象也要实现Cloneable接口并且实现clone方法
 */


/**
 * Body 类组合了 Head 类，要想深拷贝
 * Body 类，必须在 Body 类的 clone 方法中将 Head 类也要拷贝一份
 */
class Head implements Cloneable{
    //public Face face;
    public Head(){
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class  Body implements  Cloneable {
    public Head head;
    public Body(Head head) {
        this.head = head;
    }
    public Body() {
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Body newBody = (Body) super.clone();
        newBody.head=(Head) head.clone();
        return newBody;
    }
}

public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Body body = new Body(new Head());
        Body body1 = (Body)body.clone();
        System.out.println("body == body1 : " + (body == body1) );//false
        System.out.println("body.head == body1.head : " + (body.head == body1.head));//false
    }
}
