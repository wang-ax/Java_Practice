package day32.二的个数;

/**
 * ClassName day32.二的个数
 * Description TODO
 * Author 30712
 * Date 2021-02-02
 * Time 9:24
 */
public class Main {
    public  static int countNumberOf2s(int n) {
        // write code here
        /**
         * 时间复杂度是O(n*log(n))
         */
        int count =0;//2的个数
        for (int i=0;i<=n;i++){
            count +=Number2(i);
        }
        return count;
    }
    private  static int Number2(int n){
        int number =0;
        while(n !=0 ){
            if (n % 10 == 2){
                number++;
            }
            n = n/10;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOf2s(211));
    }
}
