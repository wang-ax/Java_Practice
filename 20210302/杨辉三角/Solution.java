package 杨辉三角;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName 杨辉三角
 * Description TODO
 * Author 30712
 * Date 2021-03-02
 * Time 19:00
 */
public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            List<List<Integer>> lists = generate(n);
            System.out.println(lists);
        }
    }
}
