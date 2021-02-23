package 连续最长的数字串;

import java.util.Scanner;

/**
 * ClassName 连续最长的数字串
 * Description TODO
 * Author 30712
 * Date 2021-02-23
 * Time 17:17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNext()){
            String string =sc.nextLine();
            int max =0;
            int count =0;
            int end =0;
            for (int i=0;i<string.length();i++){
                if (string.charAt(i) >='0'&& string.charAt(i)<='9'){
                    count++;
                    if (max < count){
                        max = count;
                        end =i;
                    }
                }else {
                    count =0;
                }
            }
            System.out.println(string.substring(end-max+1,end+1));
        }
    }
}
