package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPathsSourceToTarget {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> result = new ArrayList<>();

        Queue<List<Integer>> queue = new LinkedList<>();

        queue.add(Arrays.asList(0));

        int reachNode = graph.length - 1;

        while (!queue.isEmpty()) {

            List<Integer> path = queue.poll();

            int lastNode = path.get(path.size() - 1);

            if (lastNode == reachNode) {

                result.add(new ArrayList<>(path));

            } else {

                int[] neighbors = graph[lastNode];

                for (int neighbor : neighbors) {

                    List<Integer> list = new ArrayList<>(path);
                    list.add(neighbor);
                    queue.add(list);

                }

            }

        }
        return result;

    }

}
