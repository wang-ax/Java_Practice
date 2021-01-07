/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-07
 * Time 21:35
 */
public class TestObj{
    public static void main(String[] args){
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
}
