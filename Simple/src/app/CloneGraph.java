package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

        public Node cloneGraph(Node node) {
            
            return cloneGraph(node, new HashMap());
    
        }
    
        private Node cloneGraph(Node node , Map<Node, Node> map) {
    
            if (node == null) {
                return null;
            }
    
            if (map.containsKey(node)) {
                return map.get(node);
            }
    
            Node copy = new Node(node.val);
            map.put(node, copy);
            for (Node ng : node.neighbors) {
    
                copy.neighbors.add(cloneGraph(ng , map));
    
            }
    
            return copy;
    
    
        }
}
