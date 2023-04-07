package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		List<List<Integer>> adj = new ArrayList<>();
		int[] inDegrees = new int[numCourses];

		for (int i = 0; i < numCourses; i++) {
			adj.add(new ArrayList<>());
		}
		for (int i = 0; i < prerequisites.length; i++) {
			adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
		}

		for (int u = 0; u < numCourses; u++) {
			for (int x : adj.get(u)) {
				inDegrees[x]++;
			}
		}

		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < numCourses; i++) {
			if (inDegrees[i] == 0) {
				queue.add(i);
			}
		}

		int count = 0;
		while (!queue.isEmpty()) {
			int u = queue.remove();
			for (int ngh : adj.get(u)) {
				--inDegrees[ngh];
				if (inDegrees[ngh] == 0) {
					queue.add(ngh);
				}
			}
			count++;
		}

		return count == numCourses;

	}

}
