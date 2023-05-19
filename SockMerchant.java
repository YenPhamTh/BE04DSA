package DSAday2;

import java.util.HashMap;

public class SockMerchant {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println("Pairs of socks: " + sockMerchant(arr));
		System.out.println("Time complexitiy: On");
	}

	public static int sockMerchant(int[] arr) {
		HashMap<Integer, Integer> countSock = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (countSock.containsKey(arr[i])) {
				countSock.put((arr[i]), countSock.get(arr[i]) + 1);
			} else {
				countSock.put(arr[i], 1);
			}
		}
		
		int countPairOfSocks = 0;
		for (int num : countSock.keySet()) {
			countPairOfSocks = countPairOfSocks + (int) countSock.get(num) / 2;
		}
		
		return countPairOfSocks;
	}
}
