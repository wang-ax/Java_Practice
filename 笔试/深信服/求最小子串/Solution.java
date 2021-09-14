package 深信服.求最小子串;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName 深信服.求最小子串
 * Description TODO
 * Author 30712
 * Date 2021-09-14
 * Time 19:36
 */
public class Solution {
    public String substr (String a, String b) {
        // write code here
        //a的子串要覆盖b的所有的字符
        //a的所有的子串都要找出来
        int min = a.length();
        int size =0;
        String res = "";
        for (int i =0;i<a.length();i++){
            for (int j =i+1;j < a.length();j++){
                //得到的是所有的子串，判断该字串中是否包含b的所有的字符
                String temp = a.substring(i,j);
                if (iscontains(temp,b)){
                    size = j-i+1;
                    if (size < min){
                        min = size;
                        res = temp;
                    }
                }
            }
        }
        return res;
    }

    private boolean iscontains(String temp, String b) {
        //判断temp中是否包含b中的所有字符
        Set<Character> set = new HashSet<>();
        for (int i =0;i<temp.length();i++){
            set.add(temp.charAt(i));
        }
        for (int i =0;i<b.length();i++){
            if (!set.contains(b.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "DKAFWADCBEILBCEEA";
        String b = "BCA";
        Solution solution = new Solution();
        System.out.println(solution.substr(a, b));
    }
}
