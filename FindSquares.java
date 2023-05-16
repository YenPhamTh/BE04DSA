package DSAday1;

import java.util.ArrayList;

public class FindSquares {
	public static void main(String[] args) {
		int a = 1;
		int b = 9;
		System.out.println(findHowManySquares(a, b));
	}

	public static int findHowManySquares(int a, int b) {
		ArrayList<Integer> squares = new ArrayList<Integer>();
		for (int num = a; a <= Math.sqrt(b); a++) {
			if (num * num <= b) {
				squares.add(num);
			}
		}
		return squares.size();
	}
}
