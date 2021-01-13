package 数组中只出现一次的数字;

/**
 * ClassName 数组中只出现一次的数字
 * Description TODO
 * Author 30712
 * Date 2021-01-13
 * Time 9:49
 */
public class Solution {
    /**
     * 1.
     * 只有一个数出现了一次，其他数都出现了两次
     * 0与其他数字异或的结果是那个数字，相等的数字异或得 0
     * @param a
     * @return
     */
    public static int findOnceFrom2(int[] a) {
        int len = a.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            //从开始进行异或，
            //最终得到的结果就是在数组中出现一次的数字
            res = res ^ a[i];
        }
        return res;
    }

    /**
     * 2.
     *数组中只出现一次的数字,有两个数只出现了一次
     * @param array
     * @param num1
     * @param num2
     */
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        //这个数组中只有两个数出现了一次，其他的数都出现了两次
        int len = array.length;
        //特殊情况：
        if (len == 2){
            //只有两个元素，这两个数都只出现了一次
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }

        int flag= 0;
        for (int i= 0;i<array.length;i++){
            flag ^= array[i];
        }
        int site = flag-(flag&(flag-1));
        num1[0] = 0;
        num2[0] = 0;
        for (int i =0;i< len;i++){
            int temp = site;
            if ((site & array[i]) == site){
                num1[0] ^= array[i];
            }else {
                num2[0] ^= array[i];
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] array ={1,2,2,3,4,3};
        int[] num1= new int[1] ;
        int[] num2 = new int[1];
        FindNumsAppearOnce(array,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
       /* System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));*/
    }
}
