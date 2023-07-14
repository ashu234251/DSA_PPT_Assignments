package in.ineuron.question;

public class Question7 {
	static void printKMax(int arr[], int N, int K) {
		int j, max;

		for (int i = 0; i <= N - K; i++) {

			max = arr[i];

			for (j = 1; j < K; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.print(max + " ");
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,3,-1,-3,5,3,6,7};
		int K = 3;
		printKMax(arr, arr.length, K);
	}
}
