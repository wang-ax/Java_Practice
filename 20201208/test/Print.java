package day13.test;

/**
 * ClassName day13.test
 * Description TODO
 * Author 30712
 * Date 2020-12-08
 * Time 13:37
 */
public class Print {
    static boolean out(char c){
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i =0;
        for (out('A');out('B')&&(i <2);out('C')){
            i++;
            out('D');
        }
    }
}
