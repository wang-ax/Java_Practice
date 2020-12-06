package day11;

import java.util.*;


public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        List<Long> list = new ArrayList<>();
        Map<Long,Integer> map = new HashMap<>();

        //先得到这个数每一位的数字
        long x = 0;
        while (n > 0){
            x = n%10;
            n = n/10;
            list.add(x);
        }
        //得到每个数字出现的次数
        for (Long  e :list){
            Integer count = map.get(e);
            map.put(e,count == null ? 1: count+1);
        }

        //System.out.println(map);
        //Set是有序的，而且可以去重
        Set<Long> keys = map.keySet();
        for (Long  key :keys){
            System.out.println(key +":"+map.get(key));
        }
    }
}