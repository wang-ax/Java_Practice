import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName Solution2
 * Description TODO
 * Author 30712
 * Date 2020-11-14
 * Time 19:39
 */
public class Solution2 {
    private List<Integer> intArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<array.length;i++) {
            list.add(array[i]);
        }
        return list;
    }
    //栈的压入、弹出序列
    public boolean IsPopOrder(int[] pushA,int[] popA) {
        List<Integer> pushList = intArrayToList(pushA);
        List<Integer> popList = intArrayToList(popA);

        Deque<Integer> stack= new LinkedList<>();

        while (!popList.isEmpty()) {
            int p = popList.remove(0);
            while (stack.isEmpty() || stack.peek() != p) {
                if(pushList.isEmpty()) {
                    return false;
                }
                int q = pushList.remove(0);
                stack.push(q);
            }
            //弹出栈顶元素
            stack.pop();
        }
        return stack.isEmpty();
    }
}
