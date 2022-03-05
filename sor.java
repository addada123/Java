import java.util.Arrays;

public class sor {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        return Arrays.stream(nums).filter(num -> num != val).toArray().length;

    }
}
