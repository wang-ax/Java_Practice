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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string1 = scanner.nextLine().toUpperCase();
            String string2 = scanner.nextLine().toUpperCase();
            char[] chars1 = string1.toCharArray();
            char[] chars2 = string2.toCharArray();
            Set<Character> set1 = new LinkedHashSet<>();
            Set<Character> set2 = new LinkedHashSet<>();
            for (int i=0;i< chars1.length;i++){
                set1.add(chars1[i]);
            }
            for (int i=0;i< chars2.length;i++){
                set2.add(chars2[i]);
            }
            for (Character c : set2){
                set1.remove(c);
            }
            for (Character c : set1){
                System.out.print(c);
            }
        }
    }
}
