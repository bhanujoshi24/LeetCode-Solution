package com.dsa.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TopologicalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edge[][] = { { 0, 1 }, { 2, 1 }, { 0, 2 }, { 1, 3 }, { 5, 3 }, { 5, 4 }, { 3, 4 } };
		int n = 6;
		List<Integer> arr = topo_sort(edge, n);
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}

	public static List<Integer> topo_sort(int[][] edges, int n) {
		int[] indegree = new int[n];

		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		Arrays.fill(indegree, 0);

		for (int[] edge : edges) {
			indegree[edge[1]]++;
			List temp = map.getOrDefault(edge[0], new ArrayList<Integer>());
			temp.add(edge[1]);
			map.put(edge[0], temp);
		}

		Queue<Integer> queue = new ConcurrentLinkedQueue<Integer>();

		for (int i = 0; i < indegree.length; i++) {
			if (indegree[i] == 0) {
				indegree[i] = -1;
				queue.add(i);
			}
		}

		List<Integer> ans = new ArrayList<Integer>();

		while (!queue.isEmpty()) {
			int node = (int) queue.poll();
			if (map.get(node) != null) {
				for (int to_node : map.get(node)) {
					indegree[to_node]--;
				}
			}

			for (int i = 0; i < indegree.length; i++) {
				if (indegree[i] == 0) {
					queue.add(i);
					indegree[i] = -1;
				}
			}
			ans.add(node);
		}

		return ans;
	}

}
