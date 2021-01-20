package day20;

import java.util.HashMap;
import java.util.Set;

/**
 * ClassName day20
 * Description TODO
 * Author 30712
 * Date 2021-01-20
 * Time 17:47
 */
public class Gift {
    public int getValue(int[] gifts, int n) {
        int result =0;
        // write code here
        //出现的次数超过红包总数的一半的数
       /* int value= n/2;
        //把gifts进行排序
        Arrays.sort(gifts);
        //如果该数字超过了数组长度的一半
        for (int i =0;i<gifts.length/2;i++){

        }*/
        //记录
        //使用map保存（数字，次数）
//统计每个数字出现的次数
//使用Map保存，key保存数组中的数字，value保存数字出现的次数
        HashMap<Integer,Integer> map = new HashMap<>();
//每个数字出现的次数
        for (int i = 0;i<n;i++){
            int count =0;
            for(int j =0;j<n;j++){
                if(gifts[i] == gifts[j]){
                    count++;
                }
            }
            map.put(gifts[i],count);
        }
//遍历map中的key，通过key得到对应的数字出现的次数
        Set<Integer> keys = map.keySet();//得到map中的所有key值
        for(Integer key :keys){
            if(map.get(key) >=(gifts.length)/2){
                //System.out.println(key);
                result = key;
            }
        }
        return result;
    }
}
