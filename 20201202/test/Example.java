package day9.test;

/**
 * ClassName day9.test
 * Description TODO
 * Author 30712
 * Date 2020-12-02
 * Time 18:04
 */
public class Example {
    String str = new String ("hello");

    char[] chars = {'a','b'};

    public static void main(String[] args) {
        Example example  = new Example();
        System.out.println(example.str );
        System.out.println(example.chars);
        example.change(example.str,example.chars);
        System.out.println(example.str );
        System.out.println(example.chars);
    }

    private void change(String str, char[] chars) {
        str = "test ok";
        chars[0] = 'c';
    }
}
