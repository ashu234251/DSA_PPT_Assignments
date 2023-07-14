package in.ineuron.question;
import java.io.*;
public class Question5 {
	static int divide(int a, int b) {
		while (a % b == 0)
			a = a / b;
		return a;
	}
	static int isUgly(int no) {
		no = divide(no, 2);
		no = divide(no, 3);
		no = divide(no, 5);

		return (no == 1) ? 1 : 0;
	}
	static int uglyNo(int n) {
		int i = 1;
		int count = 1;
		while (n > count) {
			i++;
			if (isUgly(i) == 1)
				count++;
		}
		return i;
	}
	public static void main(String args[]) {
		int no = uglyNo(10);
		System.out.println("150th ugly " + "no. is " + no);
	}
}
