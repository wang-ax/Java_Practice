package 圆圈中最终剩下的数;

import java.util.ArrayList;

/**
 * ClassName 圆圈中最终剩下的数
 * Description TODO
 * Author 30712
 * Date 2021-01-15
 * Time 11:59
 */
public class Solution {
    //圆圈中最终剩下的数

    /**
     *计算圆圈中最终剩下哪个小朋友可以不表演节目就能拿到礼品
     * @param n 表示总共有n个小朋友
     * @param m 表示小朋友从0-（m-1）报数，喊到m-1的小朋友就要表演节目
     *          即：每隔m-1个人就从圆圈中删除一个人
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        if(n ==0 ){
            return -1;
        }
        //每隔两个数就删除
        ArrayList<Integer> list = new ArrayList<>();
        int i =0;
        for ( i =0;i< n;i++){
            list.add(i);
        }
        while (list.size() > 1){
            i = (i + m-1) %list.size();//每隔m-1个数字删除一个数字
            list.remove(i);
        }
        return list.get(0);
    }
}
