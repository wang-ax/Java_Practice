package 通配符匹配;

/**
 * ClassName 通配符匹配
 * Description TODO
 * Author 30712
 * Date 2021-02-20
 * Time 15:22
 */
public class Solution {
    //动态规划
    public boolean isMatch(String s, String p) {
        //两个字符串完全匹配才算匹配成功
        //*表示可以匹配任意字符串
        //？表示可以匹配一个字符
        if (s == null || p == null){
            return false;
        }
        if (s == null && p == null){
            return true;
        }
        //使用二维数组
        //状态定义：dp[i][j]表示s的前i个字符和p的前p个字符是否匹配
        //初始化状态
        //状态转移方程：
        //如果p[j] 是* ，dp[i][j] = dp[i][j-1]|| dp[i-1][j]
        //如果p[j] 是？ ,dp[i][j] = dp[i-1][j]
        //如果p[j] 是‘a-z’，dp[i][j] = s[i - 1] == p[j - 1] && dp[i - 1][j - 1]
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        //dp[0][0] s前0个字符和p的前0个字符是否匹配
        //前0个字符表示的是空字符串
        dp[0][0] = true;//空字符串是true

        for(int j = 1; j <= n; j++){
            char c = p.charAt(j - 1);
            if(c == '*'){
                dp[0][j] = true;
            }
            else{
                break;
            }
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                char si = s.charAt(i - 1);
                char pj = p.charAt(j - 1);
                if(pj == '*'){
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
                else   {
                    dp[i][j] = (pj == '?' || si == pj) && dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
