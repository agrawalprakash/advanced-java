package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleUsingGraphs {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {

            graph[i] = new ArrayList();
        }

        int[] inDegree = new int[numCourses];

        for (int[] e : prerequisites) {
            graph[e[0]].add(e[1]);
            inDegree[e[1]]++;
        }

        Queue<Integer> queue = new LinkedList();

        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (! queue.isEmpty()) {

            int current = queue.poll();

            for (int c : graph[current]) {

                inDegree[c]--;

                if (inDegree[c] == 0) {
                    queue.add(c);
                }

            }

            numCourses--;

        }

        return numCourses == 0;

    }


}
