package DSAday1;

import java.util.HashMap;

public class FindOddFrequency {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15 };
		FindOddFreq(arr);
	}

	public static void FindOddFreq(int[] arr) {
		HashMap<Integer, Integer> countFreq = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (countFreq.containsKey(arr[i])) {
				countFreq.put((arr[i]), countFreq.get(arr[i]) + 1);
			} else {
				countFreq.put(arr[i], 1);
			}
		}
		for (int num : countFreq.keySet()) {
			if (countFreq.get(num) % 2 == 1) {
				System.out.println("Number: " + num + " - Frequency: " + countFreq.get(num));
			}
		}
	}
}
