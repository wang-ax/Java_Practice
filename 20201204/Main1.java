package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName day8
 * Description TODO
 * Author 30712
 * Date 2020-12-04
 * Time 0:42
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if( n > 1000){
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for(int i  = 0;i<n;i++) {
                list.add(i);
            }
            int i = 0;
            while(list.size() > 1){
                //每次删除的都是当前位置的后面第2个
                i = (i+2)% list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
