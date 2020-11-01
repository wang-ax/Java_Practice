package leetcode._771_jewels_and_stones;

import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-01
 * Time 18:21
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {

        Set<Character>  宝石 = new TreeSet<>();
        char[] chars = J.toCharArray();
        for(char j : chars) {
            宝石.add(j);
        }

        int count =0;
        char[] chars1 = S.toCharArray();
        for(char s: chars1) {
            if(宝石.contains(s)) {
                count++;
            }
        }
        return count;
    }

}
