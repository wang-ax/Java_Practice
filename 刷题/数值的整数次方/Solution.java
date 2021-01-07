package 数值的整数次方;

/**
 * ClassName 数值的整数次方
 * Description TODO
 * Author 30712
 * Date 2021-01-07
 * Time 21:11
 */
public class Solution {
    public double Power(double base, int exponent) {
        double result =base;
        //如果次方是正数，直接乘
        if(exponent > 0){
            for(int i =0;i<exponent-1;i++){
                result = base*result;
            }
        }else if(exponent < 0){//是负数，先让次方变为正的，再将最后的结果取倒数
            exponent = -exponent;
            for(int i =0;i<exponent-1;i++){
                result = base*result;
            }
            result = 1/result;
        }else{//分为了三种情况，如果是0，所有数的0次方都是1
            result =1;
        }
        return result;
    }
}