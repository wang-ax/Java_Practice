/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 14:27
 */
public class Test6 {
    static boolean foo(char c)
    {
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
        int i =0;
        for(foo('A');foo('B')&&(i<2);foo('C'))
        {
            i++;
            foo('D');
        }
    }
}
