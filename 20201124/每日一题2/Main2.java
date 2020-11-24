package 每日一题2;

/**
 * ClassName 每日一题
 * Description TODO 数组中的逆序对
 * 有一组数，对于其中任意两个数字，若前面一个大于后面一个数字，则这两个数字组成一个逆序对。
 * 计算给定数组中的逆序对的个数
 * Author 30712
 * Date 2020-11-24
 * Time 14:39
 */
public class Main2 {
    public static int count(int[] A, int n) {
        // write code here
        //先看第一个数，第一个数是不是比后面的数大，如果大，count++。然后依次遍历看第2，3,  n-1
        int count =0;//逆序对个数
        for(int i = 0;i<n-1;i++) {
            for(int j =i+1;j<n;j++) {
                if(A[i] > A[j] ){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,0};
        int n =8;
        System.out.println(count(a, n));
    }
}
