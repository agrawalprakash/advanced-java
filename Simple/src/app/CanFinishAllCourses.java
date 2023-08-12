package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CanFinishAllCourses {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {

            graph[i] = new ArrayList();

        }

        int[] inDegree = new int[numCourses];

        for (int[] preReq : prerequisites) {

            graph[preReq[0]].add(preReq[1]);
            inDegree[preReq[1]]++;

        }

        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < numCourses; i++) {

            if (inDegree[i] == 0) {
                queue.add(i);
            }

        }

        while (!queue.isEmpty()) {

            int current = queue.poll();

            for(int course : graph[current]) {

                inDegree[course]--;

                if (inDegree[course] == 0) {
                    queue.add(course);
                }

            }

            numCourses--;

        }

        return numCourses == 0;


    }
    
}
