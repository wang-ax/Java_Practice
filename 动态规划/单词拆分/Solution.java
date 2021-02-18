package 单词拆分;

import java.util.List;

/**
 * ClassName 单词拆分
 * Description TODO
 * Author 30712
 * Date 2021-02-17
 * Time 22:40
 */
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        /*boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0 && !dp[i]; j--) {
                String check = s.substring(j, i);
                dp[i] = dp[j] && wordDict.contains(check);
            }
        }
        return dp[s.length()];*/



       /* if (s.length() == 0){
            return false;
        }
        boolean[] canBreak = new boolean[s.length()+1];
        for (int i =1;i<=s.length();++i){
            //整体(1,i)
            if (wordDict.contains(s.substring(0,i))){
                canBreak[i] = true;
                continue;
            }
            //j < i && F(j) && [j+1,i]
            for (int j =i-1;j> 0;--j){
                //F(j) && [j+1,i]
                if (canBreak[j] && wordDict.contains(s.substring(j,i))){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[s.length()];*/



        if (s.length() == 0){
            return false;
        }
        boolean[] canBreak = new boolean[s.length()+1];
        canBreak[0] = true;
        for (int i =1;i<=s.length();++i){
            //整体(1,i)
           /* if (wordDict.contains(s.substring(0,i))){
                canBreak[i] = true;
                continue;
            }*/
            //j < i && F(j) && [j+1,i]
            for (int j =i-1;j>=0;--j){
                //F(j) && [j+1,i]
                if (canBreak[j] && wordDict.contains(s.substring(j,i))){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }
}
