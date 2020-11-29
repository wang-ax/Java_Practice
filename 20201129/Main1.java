package day6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName day6
 * Description TODO
 * Author 30712
 * Date 2020-11-29
 * Time 20:07
 */
public class Main1 {
    public static void main(String[] args) {
        //使用map保存（数字，次数）
        //统计每个数字出现的次数
        //如果次数大于2/n就打印
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i =0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        //使用Map保存，key保存数组中的数字，value保存数字出现的次数
        HashMap<Integer,Integer> map = new HashMap<>();
        //每个数字出现的次数
        for (int i = 0;i<arr.length;i++){
            int count =0;
            for(int j =0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            map.put(arr[i],count);
        }
        //遍历map中的key，通过key得到对应的数字出现的次数
        Set<Integer> keys = map.keySet();//得到map中的所有key值
        for(Integer key :keys){
            if(map.get(key) >=(arr.length)/2){
                System.out.println(key);
            }
        }
    }
}
