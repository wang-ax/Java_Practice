package day22.到底买不买;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //摊主的珠串
        String string = scanner.nextLine();
        //小红想做的珠串
        String string2 = scanner.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for (int i=0;i<string.length();i++){
            char c = string.charAt(i);
            list.add(c);
        }

        int num =0;//删除的个数
        for (int i=0;i< string2.length();i++){
            char c  = string2.charAt(i);
            for (int j =0;j<list.size();j++){
                //遍历小红想做的珠串
                if (c == list.get(j)){
                    list.remove(j);
                    num++;
                    break;
                }
            }
        }
        int afterCount = string.length()-num;
        int Count = string2.length()-num;
        if (num == string2.length()){
            //剩余的珠子
            System.out.println("Yes "+afterCount);
        }else {
            //缺少的珠子
            System.out.println("No " +Count);
        }
    }
}
