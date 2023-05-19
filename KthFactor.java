package DSAday2;

import java.util.ArrayList;
import java.util.Collections;

public class KthFactor {

	public static void main(String[] args) {
		int n = 100;
		int k = 5;
		System.out.println(findKthFactor(n, k));
	}

	public static int findKthFactor(int n, int k) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				factors.add(i);
				factors.add((int) n / i);
			}
		}
		Collections.sort(factors);
		System.out.println(factors.toString());
		if (factors.size() < k) {
			return -1;
		} else {
			return factors.get(k);
		}
	}
}
