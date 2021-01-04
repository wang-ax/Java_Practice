import java.util.ArrayList;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-04
 * Time 22:03
 */
public class NameList
{
    private List names = new ArrayList();
    //都使用了synchronized关键字，是线程安全的
    public synchronized void add(String name)
    {
        names.add(name);
    }
    public synchronized void printAll()     {
        for (int i = 0; i < names.size(); i++)
        {
            System.out.print(names.get(i) + "");
        }
    }

    public static void main(String[]args)
    {
        final NameList sl = new NameList();
        for (int i = 0; i < 2; i++)//new两个线程
        {
            new Thread()//new一个新的线程
            {
                public void run()//执行的run方法
                {
                    sl.add("A");
                    sl.add("B");
                    sl.add("C");
                    sl.printAll();
                    System.out.println();
                }
            }.start();//调用start，从阻塞态变为可运行状态，申请系统去进行调度
        }
    }
}

