package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 个位数的统计
 */
public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] chars = N.toCharArray();
/**
 * 正确答案：
 * list***有10个item表示0-9，每个item的值表示数字的个数
 */
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(0);//初始化每个item都是0
        }
        for (int i = 0; i < chars.length; i++) {
            // 每遇到一个数字，就把值+1
            list.set(chars[i]-'0',list.get(chars[i]-'0')+1);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>0){
                System.out.println(i+":"+list.get(i));
            }
        }

        /**
         * 自己实现的
         */
/*        Scanner scanner = new Scanner(System.in);
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
        }*/
    }
}