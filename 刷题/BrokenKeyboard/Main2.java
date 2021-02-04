package day34.BrokenKeyboard;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName day34.BrokenKeyboard
 * Description TODO
 * Author 30712
 * Date 2021-02-04
 * Time 21:30
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string1 = scanner.nextLine().toUpperCase();
            String string2 = scanner.nextLine().toUpperCase();
            char[] chars = string1.toCharArray();
            Set<Character> set = new LinkedHashSet<>();
            for (int i=0;i<chars.length;i++){
                set.add(chars[i]);
            }
            char[] chars1 = string2.toCharArray();
            for (int i=0;i< chars1.length;i++){
                if (set.contains(chars1[i])){
                    set.remove(chars1[i]);
                }
            }
            for (Character c : set){
                System.out.print(c);
            }
        }
    }
}
