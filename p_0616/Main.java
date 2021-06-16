package p_0616;

import java.util.Scanner;

/**
 * ClassName p_0616
 * Description TODO
 * Author 30712
 * Date 2021-06-16
 * Time 14:33
 */
public class Main {
    public static void main(String[] args) {
//        Scanner scanner  = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n == 1 || n == 2||n % 4 == 0){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }



        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        StringBuilder re = new StringBuilder();
        //遍历s1中的字符，如果该字符没有在s2中们就删除
        //最后判断删除之后的和s2是否相等
        for (char ch : s1.toCharArray()){
            for (int i=0;i<s2.length();i++){
                if (ch == s2.charAt(i)){
                    re.append(s2.charAt(i));
                }
            }
        }
        String s3 = re.toString();
        //判断s3和s2是否相等
       // System.out.println(s3.equals(s2));
        if (s3.equals(s2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }




    }
}
