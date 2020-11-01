package leetcode.top_k_frequent_words;
import java.util.*;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-11-01
 * Time 20:26
 */

/**
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 * 谁出现的次数最多，谁先返回；如果次数相同，就按单词的排序返回
 */
public class Solution {
    private class WordAndCount implements Comparable<WordAndCount>{
        String word;
        int count;

        public WordAndCount(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(WordAndCount o) {
            if(count > o.count) {
                return -1;
            }else if (count < o.count) {
                return  1;
            }else {
                return word.compareTo(o.word);
            }
        }
    }
    public List<String > topKFrequent (String[] words,int k) {
        //1.统计每个单词出现的次数
         Map<String, Integer> 每一个单词出现的次数 = 统计单词出现次数(words);

        WordAndCount[] array = new WordAndCount[每一个单词出现的次数.size()];
        int index = 0;
        for (Map.Entry<String, Integer> entry : 每一个单词出现的次数.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            WordAndCount wc = new WordAndCount(word, count);
            array[index++] = wc;
        }
        //2.排序（单词+次数）
        Arrays.sort(array);
        //3.按照格式，组织输出,输出出现次数前k个的单词
        List<String> ans = new ArrayList<>();
        for(int i =0;i< k;i++) {
            ans.add(array[i].word);
        }
        return ans;
    }


    private Map<String, Integer> 统计单词出现次数(String[] words) {
        Map<String ,Integer> 出现次数 = new TreeMap<>();
        for(String word :words) {
            int count = 出现次数.getOrDefault(word,0);
            出现次数.put(word,count+1);
        }
        return 出现次数;
    }
}
