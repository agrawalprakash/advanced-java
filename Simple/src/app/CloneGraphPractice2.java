package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraphPractice2 {
    class Node {

        public int val;
        public List<Node> neighbors;

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<Node>();
        }

    }

    public Node cloneGraph(Node node) { 

        return cloneGraph(node, new HashMap<Node, Node>());

    }

    public Node cloneGraph(Node node, Map<Node, Node> map) {

        if (node == null) {
            return null;
        }

        if (map.containsKey(node)) {
            return map.get(node);
        }

        Node root = new Node(node.val);

        map.put(node, root);

        for (Node ng : node.neighbors) {

            root.neighbors.add(cloneGraph(ng, map));

        }

        return root;
    }
    
}
