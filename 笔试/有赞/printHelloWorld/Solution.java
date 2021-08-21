package printHelloWorld;

/**
 * ClassName PACKAGE_NAME
 * Description TODO 打印HelloWorld
 * Author 30712
 * Date 2021-08-21
 * Time 10:10
 */
public class Solution {
    public String helloWorld (int n) {
        // write code here
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<n;i++){
            stringBuilder.append("helloworld");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 2;
        System.out.println(solution.helloWorld(n));
    }
}
