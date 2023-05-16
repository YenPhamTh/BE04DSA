package DSAday1;

import java.util.Arrays;

public class BirthdayCake {
	public static void main(String[] args) {

		int[] candles = { 4, 4, 2, 1 };
		Arrays.sort(candles);

		int countMax = 0;
		for (int i : candles) {
			if (i == candles[candles.length - 1]) {
				countMax++;
			}
		}

		System.out.println(countMax);
	}
}
