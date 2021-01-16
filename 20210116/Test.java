/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-16
 * Time 12:43
 */
public class Test {
    public  static void  complicate(){
        int x =20;
        int y =30;
        boolean b;
        b = x >50 && y > 60 || x > 50 &&  y < -60 || x < -50 && y > 60 || x < -50 &&  y< -60;
        System.out.println(b);
    }

    public static void main1(String[] args) {
        complicate();
        int i =0;
        int sum =0;
        for (i =0;i< 10;++i,sum+=i);
        System.out.println(i);
    }

        public static void add(Byte b)
        {
            b = b++;
        }
        public static void test()
        {
            Byte a = 127;
            Byte b = 127;
            add(++a);
            System.out.print(a + " ");

            add(b);
            System.out.print(b + "");
        }

    public static void main(String[] args) {
        test();
    }
}
