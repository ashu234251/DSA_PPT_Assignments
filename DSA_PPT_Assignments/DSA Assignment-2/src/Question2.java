
import java.util.HashSet;

public class Question2{
    public static int maxNumberOfDifferentCandies(int[] candyType) {
        int n = candyType.length;
        int maxAllowed = n / 2;

        HashSet<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        return Math.min(uniqueCandies.size(), maxAllowed);
    }

    public static void main(String[] args) {
        int[] candyType = { 1, 1, 2, 2, 3, 3 };
        int result = maxNumberOfDifferentCandies(candyType);
        System.out.println("Result: " + result); // Output: Result: 3
    }
}