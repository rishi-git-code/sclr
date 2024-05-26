package com.pq.problem;

import java.util.Arrays;

public class PositiveNegativepair {

	public static void main(String[] args) {
		int A[] = { 1, 1, -3, 3, -3, 2, 3, 6, -1, -1 };
		int result = solve1(A);
		System.out.println(result);

	}

	private static int solve1(int[] A) {
		Arrays.sort(A);
		int index = 0;
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				index = i;
				break;
			}
		}
		int s = index - 1;// negative side
		int e = index;
		int ans = 0;
		while (s >= 0 && e < A.length - 1) {
			if (Math.abs(A[s]) == A[e]) {
				count++;
				if ((s-1)>=0 && A[s] == A[s-1]) {
					s--;
				}
				else if((e+1)<A.length && A[e]==A[e+1]) {
					count++;
					e++;
				}
				else {
					s--;
					e++;
				}
			} else if(Math.abs(A[s]) > A[e]) {
				e++;
			}
			else {
				s--;
			}
		}

		return count;
	}
}
