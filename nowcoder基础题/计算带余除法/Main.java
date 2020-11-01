package 计算带余除法;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-11-01
 * Time 10:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        System.out.print(a/b +" "+a%b);
    }
}
