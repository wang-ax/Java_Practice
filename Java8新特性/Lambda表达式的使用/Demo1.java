package Lambda表达式的使用;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * ClassName Lambda表达式的使用
 * Description TODO
 * Author 30712
 * Date 2021-04-17
 * Time 20:20
 */
public class Demo1 {
    public static void main(String[] args) {

        //匿名内部类
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("a线程");
            }
        });
        t.start();

        //Lambda表达式
        Thread t1 = new Thread(()-> System.out.println("------") );
        t1.start();
        new Thread(()-> System.out.println("3")).start();



        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        //TreeSet<String> treeSet = new TreeSet<>(comparator);

        //使用Lambda表达式简化
        Comparator<String> comparator1 = (String o1, String o2)->{
            return o1.length()-o2.length();
        };
        Comparator<String> comparator2 = (o1,o2)->o1.length()-o2.length();
        TreeSet<String> treeSet = new TreeSet<>(comparator2);
    }
}
