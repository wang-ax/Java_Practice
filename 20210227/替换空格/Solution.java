package 替换空格;

import java.util.Scanner;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-27
 * Time 21:52
 */
public class Solution {
    //替换空格
    public String replaceSpace (String s) {
        // write code here
        //字符串替换
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){

            if(' ' == chars[i]){
                sb.append("%20");
            }else{
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            Solution solution = new Solution();
            System.out.println(solution.replaceSpace(s));
        }
    }
}