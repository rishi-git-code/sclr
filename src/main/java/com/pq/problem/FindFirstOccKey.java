package com.pq.problem;

public class FindFirstOccKey {

	public static void main(String[] args) {

		int a[] = { 0, 2, 7, 7, 7, 7, 7, 10, 12 };
		int k = 7;
		int res1 = solve1(a, k);
		System.out.println(res1 + 1);
		int res2 = solve2(a, k);
		System.out.println(res2 + 1);
	}

	private static int solve2(int[] a, int k) { //TC=O(logN)
		int idx = 0;
		int s = 0;
		int e = a.length - 1;

		while (s < e) {  
			int mid = (s + e) / 2;
			int midVal = a[mid];
			if (midVal == k) {
				idx = mid;
				if (a[mid - 1] == k) {
					e = mid - 1;
				} else {
					break;
				}
			} else if (midVal > k) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}

		return idx;
	}

	private static int solve1(int[] a, int k) { // TC=O(N)
		int idx = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k) {
				idx = i;
				break;
			}
		}

		return idx;
	}

}
