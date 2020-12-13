package day18.百万富翁问题;

/**
 * ClassName day18.百万富翁问题
 * Description TODO
 * Author 30712
 * Date 2020-12-13
 * Time 19:44
 */

/**
 * 陌生人每天给富翁十万元，富翁第一天给陌生人1分，第二天给2分，第三天给4分
 * 持续30天之后，富翁和陌生人各自给出了多少钱
 */
public class Main{
    public static void main(String[] args) {
        int s=0;
        s = 10*30;//陌生人给富翁的钱
        System.out.print(s);
        //等比数列求和得到的结果是 (2^30)-1
        //富翁给陌生人给的钱
        int x = (int)Math.pow(2,30)-1;
        System.out.print(" "+x);
    }
}
