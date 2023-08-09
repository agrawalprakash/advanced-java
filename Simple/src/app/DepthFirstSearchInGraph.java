package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchInGraph {

    public class Vertex<T> {

        private final T data;
        private boolean visited;
        private List<Vertex<T>> neighbors = new ArrayList<>();
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

    public void traverse (Vertex<T> startVertex) {

        Deque<Vertex<T>> stack = new LinkedList<>();

        stack.push(startVertex);

        while (!stack.isEmpty()) {

            Vertex<T> current = stack.pop();

            if (!current.isVisited()) {

                current.setVisited(true);
                System.out.println(current);
                Collections.reverse(current.getNeighbors());
                current.getNeighbors().forEach(stack::push);

            }

        }

    }
    
}
