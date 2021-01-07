/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-06
 * Time 23:16
 */


public class Test {
    public static void main(String[] args) {
        Father a = new Father();
        Father b = new Child();
    }
}
class Father {
    public Father() {
        System.out.println("我是父类");
    }
}
class Child extends Father {
    public Child() {
        System.out.println("我是子类");
    }
}

