package com.pq.problem;

/*
 * Problem-1: 
	26 -> 20 -> 18 -> 10 -> 9 -> 0
 */
public class NumberToZero {
	static int count1 = 0;
	public static void main(String[] args) {

		int N = 28;

		int res1 = solve1(N);
		System.out.println(res1);
		int res2 = solve2(N);
		System.out.println(res2);
	}

	private static int solve2(int N) {
		if(N==0) {
			return 0;
		}
		count1++;
		N = solve2(N-Math.max(N / 10, N % 10));
		return count1;
	}

	private static int solve1(int N) {
		int count = 0;
		while (N != 0) {
			N = N - Math.max(N / 10, N % 10);
			count++;
		}
		return count;
	}

}
