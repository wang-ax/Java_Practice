package 压缩字符串;

/**
 * ClassName 压缩字符串
 * Description TODO
 * Author 30712
 * Date 2021-02-17
 * Time 0:12
 */
public class Solution {
    public int compress(char[] chars) {
        //返回的是数组的新长度
        //直接原地更新chars
       int index = 0;//更新chars
       int i =0;//遍历chars
       while (i < chars.length){
           int sum =1;
           for (int j = i+1;j< chars.length;j++){//找到有几个相等的字符
               if (chars[j] != chars[i]){
                   break;
               }
               sum++;
           }
           chars[index++] = chars[i];
           if (sum > 1){
               String s = String.valueOf(sum);
               for (int k =0;k < s.length();k++){
                   chars[index++] = s.charAt(k);
               }
           }
           i += sum;
       }
       return index;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        char[] chars = {'a','a','b','b','c','c','c'};
        //char[] chars = {'a'};
        System.out.println(s.compress(chars));
    }
}
