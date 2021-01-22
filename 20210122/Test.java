package test;

/**
 * ClassName test
 * Description TODO
 * Author 30712
 * Date 2021-01-22
 * Time 16:14
 */
class Value{
    public int i=15;
}
public class Test{
    public void first( ){
        int i=5;
        Value v=new Value( );
        v.i=25;
        second(v,i);
        System.out.println(v.i);
    }

    public void second(Value v,int i){
        i = 0;
        v.i = 20;
        Value val = new Value( );
        v = val;
        System.out.println(v.i+" "+i);
    }

    public static void main(String argv[]){
        Test t=new Test( );
        t.first( );
    }
}
