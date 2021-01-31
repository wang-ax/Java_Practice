package leetcode.single_number;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> 出现次数 = new TreeMap<>();
        for (int n : nums) {
            int count = 出现次数.getOrDefault(n, 0);
            count++;
            出现次数.put(n, count);
        }

        for (Map.Entry<Integer, Integer> entry : 出现次数.entrySet()) {
            int n = entry.getKey();
            int count = entry.getValue();
            if (count == 1) {
                return n;
            }
        }

        // 理论不会走到这里
        return -1;
    }
}
