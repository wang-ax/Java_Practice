package 分割回文串;

/**
 * ClassName 分割回文串
 * Description TODO
 * Author 30712
 * Date 2021-02-22
 * Time 17:38
 */
public class Solution {
    //最小的分割次数
    public int minCut(String s){
        //数组保存，第一个位置到s.length()个位置
        int[] minC = new int[s.length()+1];
        //初始化，最大分割次数
        for (int i=1;i<=s.length();i++){
            minC[i] = i-1;
        }
        //i从2开始
        for (int i=2;i<=s.length();i++){
            //判断整体s是不是回文串
            if (isPal(s,0,i-1)){
                minC[i] = 0;
                continue;
            }

            for (int j =1;j < i;j++){
                //j < i && [j+1,i]是回文串
                if (isPal(s,j,i-1)){//后面部分是回文串
                    //取最小值
                    minC[i] = Math.min(minC[i],minC[j]+1);
                }
            }
        }
        return minC[s.length()];
    }
    //判断回文串
    private boolean isPal(String s, int start, int end) {
        char[] str = s.toCharArray();
        while (start < end){
            if (str[start] != str[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
