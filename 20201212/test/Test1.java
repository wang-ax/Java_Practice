package day16.test;

/**
 * ClassName day16.test
 * Description TODO
 * Author 30712
 * Date 2020-12-12
 * Time 9:13
 */
public class Test1 {
    public static void main1(String[] args) {
        int i =5;
        int s = (i++)+(++i)+(i--)+(--i);
        //s = ()// s;
    }

    public static void main(String[] args) {
        int i =0;
        int j =0;
        if((++i) > 0 || (++j)> 0){
            System.out.println(i);
            System.out.println(j);
        }
    }
}
