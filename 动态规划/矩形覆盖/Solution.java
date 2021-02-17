package 矩形覆盖;

/**
 * ClassName 矩形覆盖
 * Description TODO
 * Author 30712
 * Date 2021-02-17
 * Time 16:28
 */
// 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
// 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
public class Solution {
    public int rectCover(int target) {

        //递归
         /* if(target==1 || target==2|| target == 0) {
             return target;
         }
         return rectCover(target-1)+rectCover(target-2);*/


        //循环
        //斐波那契数列的变形
        if(target <=2){
            return target;
        }
        int x1 = 1;
        int x2 = 2;
        int res = 3;
        for(int i =3;i <= target;++i){
            res = x1+x2;
            x1 = x2;
            x2 = res;
        }
        return res;
    }
}
