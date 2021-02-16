package 字符串转换整数;

import java.util.Scanner;

/**
 * ClassName 字符串转整型
 * Description TODO
 * Author 30712
 * Date 2021-02-16
 * Time 23:28
 */
public class Solution {
    public int myAtoi(String s) {
        //删除字符串头尾空格
        s = s.trim();
        //空串
        if (s.length() == 0){
            return 0;
        }
        int flag =1;//符号位的标识
        int res = 0;//数值（无符号）
        int edge = Integer.MAX_VALUE/10;//判断数值是否超过范围的边界
        if (s.charAt(0) == '-'){
            flag = -1;
            s = s.substring(1,s.length());//跳过符号位
        }else if(s.charAt(0 ) == '+'){
            s = s.substring(1,s.length());//跳过符号位
        }else if(!(s.charAt(0) >='0' & s.charAt(0) <='9')){
           //如果爱是非空字符不是符号或数字，直接返回0
            return 0;
        }
        for ( char c : s.toCharArray()){
            if (c >='0' && c <='9'){
                int n = c -'0';//计算该字符代表的值是多少
                if (res >= edge){
                    if (flag == 1) {//正数
                        if (res > edge || n > 7) {//超出了Integer的范围
                            return Integer.MAX_VALUE;//MAX_VALUE:2147483647
                        }
                    }else {//负数
                        if (res > edge || n > 8){
                                return Integer.MIN_VALUE;//MIN_VALUE:-2147483648
                        }
                    }
                }
                res  = res*10+n;
            }else {
                break;
            }
        }
        return  res*flag;//数值*符号位=最终的结果
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner scanner = new Scanner(System.in);
        String  string = scanner.nextLine();
        System.out.println(s.myAtoi(string));


       /* System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648*/
    }
}
