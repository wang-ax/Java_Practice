package day11.个位数统计;

import java.util.*;

/**
 * 个位数的统计
 */
public class Main {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] chars = N.toCharArray();*/
/**
 * 正确答案：
 * list***有10个item表示0-9，每个item的值表示数字的个数
 */
        /*List<Integer> list = new ArrayList<Integer>();
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
        }*/

        /**
         * 自己实现的
         */
        Scanner scanner = new Scanner(System.in);
        String  n =scanner.next();//输入的是字符串而不是整型
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        char[] chars = n.toCharArray();//字符串变为字符数组
        for (int i =0;i< chars.length;i++){
            list.add(chars[i]-'0');//把得到的的每一位数字都传入到list中
        }
        //得到每个数字出现的次数
        //System.out.println(list);
        for (Integer  e :list){//从list中拿元素放到map中取
            Integer count = map.get(e);//每放入一个元素，如果放进去的元素是第一次出现count==null
            map.put(e,count == null ? 1: count+1);//如果count== null就将值设为1（该元素出现的次数）
        }
        Set<Integer> keys = map.keySet();//得到map中的key
        for (int  key :keys){//遍历key得到每个数字对应出现的次数
            int counts = map.get(key);
            System.out.println(key +":"+counts);
            //System.out.println(key);
        }
    }
}