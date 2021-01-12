/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-12
 * Time 12:11
 */
public class Demo {
    public static int split(int number) {
        if (number > 1) {
            if (number % 2 != 0)
                System.out.print(split((number + 1) / 2));
            System.out.print(split(number / 2));
        }
        return number;
    }
    public static void main(String[] args) {
        split(12);
    }
    public static void main2(String[] args) {
        boolean b=true?false:true==true?false:true;
        System.out.println(b);
    }
    public static void main1(String[] args) {
        Integer i1= 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);//false，超过128就是new一个对象了，所以指向的不是同一个对象

        String i3 = "100";
        String i4 = "1" + new String("00");
        System.out.println(i3 == i4);

        Integer i5 = 100;
        Integer i6 = 100;
        System.out.println(i5 == i6);//指向的是同一个对象
    }

}
