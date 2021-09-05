package GrowingIO;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-09-05
 * Time 18:50
 */
public class Solution2 {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            for (int j =1;j<=i;j++){
                int result = i*j;
                System.out.print(i+"*"+j+"=="+result+" ");
            }
            System.out.println();
        }
    }
}
