package in.ineuron.question;
import java.io.*;
import java.util.*;
public class Question2 {
	public static Boolean distinct(String str, int i, int j) {
		boolean[] visited = new boolean[26];

		for (int k = i; k <= j; k++) {
			if (visited[str.charAt(k) - 'a'] == true)
				return false;

			visited[str.charAt(k) - 'a'] = true;
		}
		return true;
	}
	public static int longestUniqueSubstr(String str) {
		int n = str.length();
		int res = 0;

		for (int i = 0; i < n; i++)
			for (int j = i; j < n; j++)
				if (distinct(str, i, j))
					res = Math.max(res, j - i + 1);

		return res;
	}
	public static void main(String[] args) {
		String str = "abcabcbb";
		int len = longestUniqueSubstr(str);
		System.out.println("The length of the longest " + "non-repeating character " + "substring is " + len);
	}
}
