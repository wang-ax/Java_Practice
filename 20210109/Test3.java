/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 14:21
 */
public class Test3 {

    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }

    public static int getValue() {
        int i = 1;
        try {
            i = 4;
        } finally{//最终都会执行finally代码块中的语句
            i++;
            return i;//执行完try之后，i变为4，finally执行 i ++ ,最终得到的结果是5
        }
    }
}
