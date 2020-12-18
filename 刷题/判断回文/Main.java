package 判断回文;

/**
 * ClassName 判断回文
 * Description TODO
 * Author 30712
 * Date 2020-12-18
 * Time 19:56
 */
public class Main {
    public boolean judge (String str) {
        // write code here
        //将字符串转换成一个字符数组，两个下标一个从前往后，一个从后往前
        char[] chars = str.toCharArray();
        int i =0;
        int j = chars.length-1;
        while(i < j){
            if (chars[i]!=chars[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
