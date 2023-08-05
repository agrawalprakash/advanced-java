package app;

import java.util.ArrayList;
import java.util.List;

public class MinimumVerticesForGraph {
    
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
 
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {

            graph[i] = new ArrayList();

        }

        int[] inDegree = new int[n];

        for (List<Integer> edge : edges) {

            graph[edge.get(0)].add(edge.get(1));

            inDegree[edge.get(1)]++;

        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (inDegree[i] == 0) {
                result.add(i);
            }

        }

        return result;

    }

}
