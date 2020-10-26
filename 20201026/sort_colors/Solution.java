package leetcode.sort_colors;

import java.util.Arrays;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-26
 * Time 19:39
 */
public class Solution {
    public static void sortColors(int[] nums) {
       //使用计数排序
        int[] color = new int[3];//定义一个一维数组
        for(int num :nums) {
            color[num]++;//储存每种颜色出现的次数
        }
        int k =0;
        for(int j = 0;j<3;j++) {
            while (color[j]-- !=0) {
                nums[k++] = j;//重新输出到原来的数组
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2,0,2,1,1,0};
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }

}
