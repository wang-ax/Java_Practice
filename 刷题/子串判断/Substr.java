package day19.子串判断;

/**
 * ClassName day19.子串判断
 * Description TODO
 * Author 30712
 * Date 2021-01-19
 * Time 17:32
 */
public class Substr {
        public  static boolean[] chkSubStr(String[] p, int n, String s) {
            // write code here
            boolean[] result = new boolean[p.length];
            //判断是不是子串
            for (int i=0;i < p.length;i++){
                if (s.contains(p[i])){
                    result[i] = true;
                }else {
                    result[i] = false;
                }
            }
            return result;
        }

    public static void main(String[] args) {
        String[] p = {"a","b","c","d"};
        int n=4;
        String  s = "abc";
        boolean[] res = chkSubStr(p,n,s);
        for (int i =0;i < res.length;i++){
            System.out.println(res[i]);
        }
    }
}
