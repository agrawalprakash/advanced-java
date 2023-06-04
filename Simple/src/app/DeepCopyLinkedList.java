package app;

import java.util.HashMap;
import java.util.Map;

public class DeepCopyLinkedList {

    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    
    
    class Solution {
        public Node copyRandomList(Node head) {
            
            if (head == null) 
                return null;
    
    
            Map<Node, Node> map = new HashMap<>();
            Node temp = head;
            while (temp != null) {
    
                map.put(temp, new Node(temp.val));
                temp = temp.next;
    
            }
    
            for (Node key : map.keySet()) {
    
                Node keyNode = map.get(key);
                keyNode.next = map.get(key.next);
                keyNode.random = map.get(key.random);
            }
    
            return map.get(head);
        }
    }
    
}
