package 字符流中第一个不重复的字符;

import java.util.LinkedList;

/**
 * ClassName 字符流中第一个不重复的字符
 * Description TODO
 * Author 30712
 * Date 2021-01-19
 * Time 15:52
 */
public class Solution {
    //Insert one char from stringstream
    //从输入流中插入一个字符
    //用一个256大小的数组统计每个字符出现的次数
    private int[] charArray = new int[256];

    private LinkedList<Character> queue = new LinkedList<>();

    public void Insert(char ch) {
        if (charArray[ch] == 0){//如果该字符出现的次数为0
            queue.offer(ch);//插入到队列中
        }
        charArray[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {

        while (!queue.isEmpty()){
            if (charArray[queue.peek()] == 1){
                return queue.peek();
            }else {
                queue.poll();
            }
        }
        return '#';
    }
}
