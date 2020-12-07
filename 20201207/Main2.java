package day11;

/**
 * ClassName day11
 * Description TODO
 * Author 30712
 * Date 2020-12-04
 * Time 20:05
 */

/**
 * 构建乘积数组
 */
public class Main2 {
    /*public static int[] multiply(int[] A){
        int[] B = new int[A.length];
        for (int i =0;i< A.length;i++){
            B[i] = B[i-1]*A[i-1];
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        System.out.println(multiply(A));
    }*/
    public int[] multiply(int[] A){
        int length = A.length;
        int[] B = new int[length];
        if(length != 0){
            B[0] = 1;
            //计算下三角连乘
            for(int i =1;i < length;i++){
                B[i] = B[i-1]*A[i-1];
            }
            int temp =-1;
            //计算上三角
            for(int j = length-2;j >= 0;j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
}
