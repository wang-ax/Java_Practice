package remove_element;

/**
 * ClassName remove_element
 * Description TODO
 * Author 30712
 * Date 2021-02-07
 * Time 0:03
 */
public class Main {
    public static int removeElement(int[] nums, int val) {

        //双指针法
        int slow =0;
        for (int fast =0;fast < nums.length;fast++){
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val =3;
        int len = removeElement(nums, val);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
