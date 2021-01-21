package 二维数组中的查找;

/**
 * ClassName 二维数组中的查找
 * Description TODO
 * Author 30712
 * Date 2021-01-21
 * Time 15:00
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        for (int i =0;i< array.length;i++){
            for (int j =0;j<array[i].length;j++){
                if (array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
