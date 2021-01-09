import java.util.ArrayList;
import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-09
 * Time 10:23
 */
public class Test1 {
    public List<Integer> nums;
    public  void numQuest() {
        int k = 0;
        Integer zero = new Integer(0);
        while (k < nums.size()) {
            if (nums.get(k).equals(zero))
                nums.remove(k);
            k++;
        }
    }
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(0);
        //numQuest(list);//将该方法写成一个静态的方法，可以直接进行调用。
        Test1.numQuest(list);//直接使用类名.方法名就可以直接调用
        System.out.println(list);
    }
    private static void numQuest(List<Integer> nums) {
        int k = 0;
        Integer zero = new Integer(0);
        while (k < nums.size()) {
            if (nums.get(k).equals(zero))
                nums.remove(k);
            k++;
        }
    }
}
