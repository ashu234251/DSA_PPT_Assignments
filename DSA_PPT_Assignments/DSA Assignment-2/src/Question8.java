public class Question8 {
    public static int minimumScore(int[] nums, int k) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        if (maxVal - minVal <= 2 * k) {
            return 0;
        }

        int potentialMin1 = maxVal - k;
        int potentialMin2 = minVal + k;

        return Math.min(potentialMin1, potentialMin2);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int result = minimumScore(nums, k);
        System.out.println("Result: " + result); 
    }
}