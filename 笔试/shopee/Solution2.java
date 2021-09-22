package shopee;

import java.util.ArrayList;

/**
 * ClassName shopee
 * Description TODO
 * Author 30712
 * Date 2021-09-22
 * Time 15:36
 */
public class Solution2 {
    /**
     * 给定含有n个元素的整型数组a，其中包含0元素和非0元素，对数组进行排序，要求如下：
     * 1、排序后所有0元素在前，所有非零元素在后，且非零元素排序前后的相对位置不变 (非零元素包含正数和负数)
     * @param list_data
     * @return
     */
    public int[] sort_data(int[] list_data) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0;i< list_data.length;i++){
            if (list_data[i] == 0){
                list.add(list_data[i]);
            }
        }
        for (int i =0;i< list_data.length;i++){
            if (list_data[i] != 0){
                list.add(list_data[i]);
            }
        }
        //链表转换成数组
        int[] res = new int[list_data.length];
        for (int i =0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] data = {0,-1,0,5,1,0,0};
        int[] ints = solution2.sort_data(data);
        for (int i : ints){
            System.out.println(i);
        }
    }
}
