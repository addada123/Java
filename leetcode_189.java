import java.util.Arrays;

public class leetcode_189 {
    public static void rotate(int[] nums, int k) {
        int i = 0;
        int len = nums.length - 1;
        while (i <= k) {
            int temp = nums[len];

            i++;
        }
        System.out.println(i - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(nums, 3);
    }
}
