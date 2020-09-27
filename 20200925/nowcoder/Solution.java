package nowcoder;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-09-27
 * Time 9:56
 */
public class Solution {
    //数组转换为list
    private List<Integer> intArrayToList (int[] array){
        List<Integer> list = new ArrayList<>();
        for(int i =0;i< array.length ;i++) {
            list.add(array[i]);
        }
        return list;
    }

    public boolean IsPopOrder(int [] pushA,int [] popA){
        List<Integer>  pushList = intArrayToList(pushA);
        List<Integer>  popList = intArrayToList(popA);

        Deque<Integer> stack = new LinkedList<>();//准备一个栈

        while(!popList.isEmpty()){
            int p = popList.remove(0);//取出第一个元素
            while(true) {
                if(stack.isEmpty() || stack.peek().intValue() != p) {
                    if(pushList.isEmpty()) {
                        return false;
                    }
                    int q = pushList.remove(0);
                    stack.push(q);
                } else{
                    break;
                }
            }
            stack.pop();
        }
        return true;
    }
}
