
import java.util.Arrays;

public class Question5 {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int case1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int case2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(case1, case2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int result = maximumProduct(nums);
        System.out.println("Result: " + result); 
    }
}