package pratice;

import java.util.Scanner;

/**
 * ClassName Main9
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 16:48
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String[] str = scanner.nextLine().split(" ");
            int a =  Integer.parseInt(str[0]);
            int b =  Integer.parseInt(str[1]);
            int c =  Integer.parseInt(str[2]);
            //任意两边之和大于第三边
            if( a+b>c && a+c > b && b+c >a){
                if(a == b && a== c ) {
                    System.out.println("Equilateral triangle!");
                } else if(a==b || b==c || a== c){
                    System.out.println("Isosceles triangle!");
                }else {
                    System.out.println("Ordinary triangle!");
                }
            }else{
                System.out.println("Not a triangle!");
            }
        }
    }
}
