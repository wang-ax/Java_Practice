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
        while (scanner.hasNext()) {

            String str = scanner.nextLine();//String型的基因序列
            int n = scanner.nextInt();//子串的长度
            /**
             * 第一种方法（myself）
             */
            int max = 0;
            int count = 0;//G和C的总个数
            int i =0;
            int start =0;
            int end =0;
            String maxString = "";
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
                    maxString = subString;
                }
            }
            //System.out.println(max);//GC比例最高的子串中GC的个数
            System.out.println(maxString);

            /**
             * 第二种方法
             */
//        String maxStr= "";//记录比例最高的字符串
//        double maxRatio= 0;//记录目前出现的最高比例
//        for (int i =0;i<str.length()-n+1;i++){
//            String  string = str.substring(i,i+n);//截取有效的子串的长度
//
//            if(GiveRatio(string) > maxRatio){//写一个方法判断该字串的的GC比例，如果GC比例大于最大值
//                maxStr = string;
//                maxRatio = GiveRatio(string);
//            }
//        }
//        System.out.println(maxStr);
        }
    }

    private static double GiveRatio(String str) {
        double radio =  0;//GC比例，不能使用int，使用int 在除操作之后会将小数点省去
        double count = 0;//GC的个数
        for (char ch : str.toCharArray()){//字符串转为字符数组，依次遍历每一个字符

            if (ch == 'G' || ch == 'C')
                count++;
        }
        radio = count/(double)str.length();
        return radio;//GC的比例
    }
}
