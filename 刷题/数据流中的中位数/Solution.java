package 数据流中的中位数;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName 数据流中的中位数
 * Description TODO
 * Author 30712
 * Date 2021-01-20
 * Time 16:48
 */
public class Solution {
    //读取数据流
    ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }
    //获取当前读取数据的中位数
    public Double GetMedian() {
        Collections.sort(list);
        if (list == null){
            return null;
        }
        int len = list.size();
        if (len %2 == 0){
            return (list.get(len/2)+list.get(len/2 -1))/2.0;
        }
        return Double.valueOf(list.get(len/2));
    }
}
