package 剪绳子;

/**
 * ClassName 剪绳子
 * Description TODO
 * Author 30712
 * Date 2021-01-21
 * Time 12:02
 */
public class Solution {
    /**
     * 2：1*1
     * 3：1*2
     * 4：2*2
     * 5：2*3
     * 6：3*3
     * 7：2*2*3
     * 8:2*3*3
     * 9:3*3*3
     * 10:2*2*3*3
     * 11:2*3*3*3
     * 12:3*3*3*3
     * @param target 绳子的长度
     * @return
     */
    public int cutRope(int target) {
        int x = 0;
        int y =0;
        int maxValue = 2;
        if (target < 2 || target > 60){
            return -1;
        }
        if (target == 2){
            return 1;
        }
        if (target == 3){
            return 2;
        }
        if (target % 3 == 0){
            //是3的倍数
            maxValue = (int) Math.pow(3,target/3);
        }else {
            x = target-2;
            y = x%3;
            maxValue = maxValue*(int)Math.pow(3,x/3);
            if (0 != y){
                maxValue = maxValue*y;
            }
        }
        return maxValue;
    }
}
