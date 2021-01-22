package test;

/**
 * ClassName test
 * Description TODO
 * Author 30712
 * Date 2021-01-22
 * Time 16:10
 */
class Parent {
    public  float aFun(float a,float b){
        float x = a +b;
        return x;
    }
}
public class Child  extends Parent{
     public float aFun(float a,float b){
         return  a+b;
    }
    /*public int aFun(int a,int b){

    }*/
    private int aFun(int a,int b){
        return  a*b;
    }
}
