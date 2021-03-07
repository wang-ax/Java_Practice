package 最小的K个数;

/**
 * ClassName 最小的K个数
 * Description TODO
 * Author 30712
 * Date 2021-03-06
 * Time 22:45
 */
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 直接进行排序
 */
public class Solution2 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length == 0 || input.length < k){
            return list;
        }
        Arrays.sort(input);//时间复杂度是O(n*log(n))
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        //输入的数组中没有相同的数字
        int[] array = {4,5,1,6,2,7,3,8};
        Solution2 solution2  =new Solution2();
        //边界值测试
        System.out.println(solution2.GetLeastNumbers_Solution(array, 1));//k=1
        System.out.println(solution2.GetLeastNumbers_Solution(array, 8));//k=array.length
        //特殊值测试：k<1,k>array.length()
        System.out.println(solution2.GetLeastNumbers_Solution(array, 0));
        System.out.println(solution2.GetLeastNumbers_Solution(array, 10));


        //输入的数字中相同的数字
        int[] array1 = {1,2,3,4,5,3,2};
        System.out.println(solution2.GetLeastNumbers_Solution(array1, 1));//k=1
        System.out.println(solution2.GetLeastNumbers_Solution(array1, array1.length));//k=array.length
        //特殊值测试：
        System.out.println(solution2.GetLeastNumbers_Solution(array1, 0));//k<1
        System.out.println(solution2.GetLeastNumbers_Solution(array1, 10));//k>array.length()


    }
}
