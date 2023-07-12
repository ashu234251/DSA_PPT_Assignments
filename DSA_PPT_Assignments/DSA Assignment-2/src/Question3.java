
import java.util.HashMap;

public class Question3{
    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

       
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

      
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                int len = countMap.get(num) + countMap.get(num + 1);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
        int result = findLHS(nums);
        System.out.println("Result: " + result);
    }
}