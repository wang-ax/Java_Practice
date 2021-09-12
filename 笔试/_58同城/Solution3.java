package _58同城;

import java.util.HashMap;

/**
 * ClassName 同城
 * Description TODO 计算按键所需时间
 * Author 30712
 * Date 2021-09-11
 * Time 21:05
 */
public class Solution3 {
    public static int solution (String psw) {
/*        int result =0;
        String[] str = {"awf","dzc","gql","jti","mkr","pon","shx","veb","yu"};
        // write code here
        char[] chars = psw.toCharArray();
        for (int i =0;i < psw.length();i++){
            //用每个字符去匹配
            for (int j =0;j < str.length;j++){
                char[] array = str[i].toCharArray();
                for (int k =0;k  < array.length;k++){
                    if (chars[i] == array[k]){
                        result += (k+1);
                    }
                }
            }
        }
        return result;*/
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',11);
        map.put('w',12);
        map.put('f',13);

        map.put('d',21);
        map.put('z',22);
        map.put('c',23);

        map.put('g',31);
        map.put('q',32);
        map.put('l',33);


        map.put('j',41);
        map.put('t',42);
        map.put('i',43);

        map.put('m',51);
        map.put('k',52);
        map.put('r',53);

        map.put('p',61);
        map.put('o',62);
        map.put('n',63);

        map.put('s',71);
        map.put('h',72);
        map.put('x',73);

        map.put('v',81);
        map.put('e',82);
        map.put('b',83);

        map.put('y',91);
        map.put('u',92);

        int time = 0;
        char[] arr = psw.toCharArray();
        for(int i = 0;i < psw.length();i++){
            int temp = map.get(arr[i]);
            if(temp % 10 == 3) time += 3;
            if(temp % 10 == 2) time += 2;
            if(temp % 10 == 1) time += 1;

            if(i > 0){
                int last = map.get(arr[i-1]);
                //判断当前的和上一个是否属于同一个按钮
                if(last /10 == temp /10){
                    time += 2;
                }
            }

        }
        return time;
    }

    public static void main(String[] args) {
        String s = "asdft";
        System.out.println(solution(s));
    }
}
