package 奇安信.最长连续子序列的长度;

/**
 * ClassName 奇安信.最长连续子序列的长度
 * Description TODO
 * Author 30712
 * Date 2021-09-07
 * Time 19:21
 */

public class Solution {
    /**
     * @param members int整型一维数组 年龄乱序的团队成员
     * @return
     */
    public int MALS (int[] members) {
        if (members == null || members.length == 0){
            return -1;
        }
        int n = members.length;
        // write code here
        int max = 1;//最大连续子序列的长度
        for (int i = 0 ;i< n;i++){
            int count =1;
            int flag = members[i];
            int j = i+1;
            while ( j < n){
                if (members[j] == flag +1){
                    count++;
                    flag = members[j];
                }else {
                    j++;
                    continue;
                }
                j++;
            }
            if (count > max){
                max = count;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
       //int[] nums = {20,40,41,41,21,22};
        int[] nums = {20,20,30,31,32,40,33};
        System.out.println(solution.MALS(nums));
    }
}
