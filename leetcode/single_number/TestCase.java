package leetcode.single_number;

public class TestCase {
    public static void main(String[] args) {
        int[] array = { 3, 1, 3, 5, 2, 9, 5, 2, 9 };
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(array));
    }
}
