/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-09
 * Time 12:04
 */
public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("value ="+switchit(4));
    }

    private static int switchit(int x) {
        int j =1;
        switch (x){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }
}
