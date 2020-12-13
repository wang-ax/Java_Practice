package day18.DNA序列;

import java.util.Scanner;

/**
 * ClassName day18.DNA序列
 * Description TODO 输出GC比例最高的子串，如果有多个输出第一个的子串
 * Author 30712
 * Date 2020-12-13
 * Time 19:44
 */
public class Main {
    public static void main(String[] args) {
        //从第一个字符串开始，每次取出5个字符串，计算其中G和C的个数
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();//String型的基因序列
        int n = scanner.nextInt();//子串的长度
        int max = 0;
        int count = 0;//G和C的总个数
        int i =0;
        int start =0;
        int end =0;
        for ( i =0;i<= str.length()-n;i++){
            count =0;
            String subString = str.substring(i,i+n);
            char[] chars = subString.toCharArray();
            //System.out.println(Arrays.toString(chars));
            for (int j =0;j<chars.length;j++){
                if(chars[j] == 'C'||chars[j] == 'G'){
                    count++;
                }
            }
            if(count > max){
                int tmp = count;
                count = max;
                max = tmp;
            }
            start = i;
            end = i+n;
        }
        System.out.println(str.substring(start,end));
        System.out.println(max);
    }
}
