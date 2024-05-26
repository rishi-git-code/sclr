package com.sclr.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraMinummumDistance {

	public static void main(String[] args) {
		int A = 8;
		int B[][] = { { 0, 1, 4 }, { 0, 7, 8 }, { 1, 7, 7 }, { 1, 2, 8 }, { 2, 8, 2 }, { 7, 8, 7 }, { 7, 6, 1 },
				{ 6, 5, 2 }, { 2, 5, 5 }, { 2, 3, 7 }, { 3, 4, 9 }, { 3, 5, 14 }, { 5, 4, 10 } };
		int src = 0;
		int result[] = solve(A, B, src);
//		for(int i = 0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}

	}

	private static int[] solve(int A, int[][] B, int src) {
//		if (B == null || B.length == 0)
//			return ;
		List<pairs> graph[] = new ArrayList[A + 1];
		for (int j = 0; j <= A; j++) {
			graph[j] = new ArrayList<>();
		}
		for (int i = 0; i < B.length; i++) {
			int u = B[i][0];
			int v = B[i][1];
			int dis = B[i][2];
			graph[u].add(new pairs(v, dis));
			graph[v].add(new pairs(u, dis));
		}
		int distance[] = new int[A + 1];
		for (int i = 0; i < distance.length	; i++) {
			if (i != src) {
				distance[i] = Integer.MAX_VALUE;
			}
		}
		boolean visited[] = new boolean[A + 1];
		visited[src] = true;
		PriorityQueue<pairs> q = new PriorityQueue<>((a, b) -> a.dis - b.dis);
		for (pairs child : graph[src]) {
			q.add(child);
		}
System.out.println(q);
		while (!q.isEmpty()) {
			
			pairs p = q.poll();
			if (visited[p.val]) {
				continue;
			}
			visited[p.val] = true;
			List<pairs> children = graph[p.val];
			for (pairs child : children) {
				int current = distance[p.val] + child.dis;
				System.out.println(current);
				if (current < distance[child.val]) {//   if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
					distance[child.val] = current;
					q.add(new pairs(child.val, current));
				}
			}
		}

		return distance;
	}

}

class pairs {
	int val;
	int dis;

	pairs(int x, int y) {
		this.val = x;
		this.dis = y;

	}
}
