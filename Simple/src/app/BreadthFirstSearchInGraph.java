package app;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchInGraph {

    
    public class Vertex<T> {

        private final T data;
        private boolean visited;
        private List<Vertex<T>> neighbors = new LinkedList<>();

        public T getData() {
            return data;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public List<Vertex<T>> getNeighbors() {
            return neighbors;
        }

        public void setNeighbors(List<Vertex<T>> neighbors) {
            this.neighbors = neighbors;
        }

    }

    private final Vertex<T> startVertex;

    public BreadthFirstSearchInGraph(Vertex<T> startVertex) {
        this.startVertex = startVertex;
    }

    public void traverse() {

        Queue<Vertex<T>> queue = new LinkedList<>();

        queue.add(startVertex);

        while (!queue.isEmpty()) {

            Vertex<T> current = queue.poll();

            if (!current.isVisited()) {

                current.setVisited(true);
                System.out.println(current);
                queue.addAll(current.getNeighbors());

            }

        }
        

    }
    
}
